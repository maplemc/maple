package net.maple.io.resource.resources;

import java.io.InputStream;
import java.io.OutputStream;

import net.maple.io.resource.Resource;

public class AssetResource extends Resource {
	
	private static final String ASSETS_FOLDER = "assets/";
	
	private String path;
	
	public AssetResource(String path) {
		this(path, true);
	}
	
	public AssetResource(String path, boolean compress) {
		super(compress);
		
		this.path = path;
	}
	
	@Override
	protected InputStream inputStream() {
		Thread thread = Thread.currentThread();
		
		ClassLoader loader = thread.getContextClassLoader();
		
		return loader.getResourceAsStream(ASSETS_FOLDER + path);
	}
	
	@Override
	protected OutputStream outputStream() {
		return null;
	}
	
	public String getPath() {
		return path;
	}
	
}
