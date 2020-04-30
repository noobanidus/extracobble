package noobanidus.mods.extracobble;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import noobanidus.libs.noobutil.registrate.CustomRegistrate;
import noobanidus.mods.extracobble.init.ModBlocks;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("extracobble")
public class ExtraCobble {
  public static final Logger LOG = LogManager.getLogger();
  public static final String MODID = "extracobble";
  public static CustomRegistrate REGISTRATE;

  public static ItemGroup GROUP = new ItemGroup(MODID) {
    @Override
    public ItemStack createIcon() {
      return new ItemStack(ModBlocks.GRANITE_COBBLE.get());
    }
  };

  public ExtraCobble() {
    REGISTRATE = CustomRegistrate.create(MODID);
    REGISTRATE.itemGroup(() -> GROUP);

    ModBlocks.load();
  }
}
