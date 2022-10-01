package net.maple.watch.anchor.anchors.world.entity.player;

import java.util.function.Supplier;

import net.maple.watch.anchor.Anchor;
import net.maple.watch.control.input.InjectedInput;
import net.minecraft.client.input.Input;
import net.minecraft.client.input.KeyboardInput;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.client.option.GameOptions;

public class ClientPlayerAnchor extends PlayerAnchor<ClientPlayerEntity> {
	
	public ClientPlayerAnchor(ClientPlayerEntity player) {
		super(player);
	}
	
	public ClientPlayerAnchor(Supplier<ClientPlayerEntity> supplier) {
		super(supplier);
	}
	
	public void injectInput() {
		if(hasInjectedInput()) return;
		
		player().input = new InjectedInput();
	}
	
	public void restoreInput() {
		if(!hasInjectedInput()) return;
		
		GameOptions options = Anchor.CLIENT.options();
		
		player().input = new KeyboardInput(options);
	}
	
	public boolean hasInjectedInput() {
		return input() instanceof InjectedInput;
	}
	
	public Input input() {
		return player().input;
	}
	
}
