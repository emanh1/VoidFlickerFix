package pw._2pi.voidfixerport;

import java.util.Map;

import net.minecraftforge.fml.relauncher.IFMLLoadingPlugin;

public class FMLLoadingPlugin implements IFMLLoadingPlugin {

	@Override
	public String[] getASMTransformerClass() {
		return new String[] {ClassTransformer.class.getName()};
	}

	@Override
	public String getModContainerClass() {
		return VoidFixerPorted.class.getName();
	}

	@Override
	public String getSetupClass() {
		return null;
	}

	@SuppressWarnings("unused")
	@Override
	public void injectData(Map<String, Object> data) {
		int memes = 32;
	}

	@Override
	public String getAccessTransformerClass() {
		return null;
	}

}
