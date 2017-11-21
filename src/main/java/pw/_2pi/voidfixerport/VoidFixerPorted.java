package pw._2pi.voidfixerport;

import java.util.Arrays;

import com.google.common.eventbus.EventBus;

import net.minecraftforge.fml.common.DummyModContainer;
import net.minecraftforge.fml.common.LoadController;
import net.minecraftforge.fml.common.ModMetadata;


public class VoidFixerPorted extends DummyModContainer {
	
	public static final String MOD_ID = "voidfixerport";
	public static final String MOD_NAME = "VoidFlickerFix";
	public static final String VERSION = "1.1";
	
	public VoidFixerPorted() {
		super(new ModMetadata());
		ModMetadata meta = getMetadata();
		meta.modId = MOD_ID;
		meta.name = MOD_NAME;
		meta.version = VERSION;
		meta.description = "Fixes the void flicker at Y 62 by moving the void down to Y 0 for all world types";
		meta.authorList = Arrays.asList("2Pi", "EmanhMC", "prplz");
		meta.credits = "Some code taken from prplz's MouseDelayFix mod, original mod by 2pi, ported to 1.8.9 by EmanhMC";
		meta.url = "http://2pi.pw/mods/voidflickerfix";
	}
	
	@Override
	public boolean registerBus(EventBus bus, LoadController controller) {
		bus.register(this);
		return true;
	}

}
