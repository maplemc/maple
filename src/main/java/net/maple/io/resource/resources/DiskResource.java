package net.maple.io.resource.resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

import net.maple.Constants;
import net.maple.io.resource.Resource;

public class DiskResource extends Resource {
	
	private static final File MOD_FOLDER = new File(GameContext.directory(), "." + Constants.MOD_ID);
	
	private File file;
	
	public DiskResource(String path) {
		this(path, true);
	}
	
	public DiskResource(String path, boolean compress) {
		this(new File(MOD_FOLDER, path), compress);
	}
	
	public DiskResource(File f) {
		this(f, true);
	}
	
	public DiskResource(File f, boolean compress) {
		super(compress);
		
		this.file = f;
		
		f.getParentFile().mkdirs();
	}
	
	@Override
	protected InputStream inputStream() {
		try {
			
			return new FileInputStream(file);
			
		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
		}
		
		return null;
	}
	
	@Override
	protected OutputStream outputStream() {
		try {
			
			return new FileOutputStream(file);
			
		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
		}
		
		return null;
	}
	
	@Override
	public boolean exists() {
		if(!file.exists()) return false;
		
		return super.exists();
	}
	
	public File getFile() {
		return file;
	}
	
}
