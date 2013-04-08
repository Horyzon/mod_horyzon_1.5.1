package horyzon.armor;

import cpw.*;
import cpw.mods.*;
import cpw.mods.fml.*;
import cpw.mods.fml.client.*;
import cpw.mods.fml.client.modloader.*;
import cpw.mods.fml.client.registry.*;
import cpw.mods.fml.common.*;
import cpw.mods.fml.common.asm.*;
import cpw.mods.fml.common.asm.transformers.*;
import cpw.mods.fml.common.discovery.*;
import cpw.mods.fml.common.discovery.asm.*;
import cpw.mods.fml.common.event.*;
import cpw.mods.fml.common.functions.*;
import cpw.mods.fml.common.modloader.*;
import cpw.mods.fml.common.network.*;
import cpw.mods.fml.common.registry.*;
import cpw.mods.fml.common.toposort.*;
import cpw.mods.fml.common.versioning.*;
import cpw.mods.fml.relauncher.*;
import cpw.mods.fml.server.*;
import ibxm.*;
import net.*;
import net.minecraft.*;
import net.minecraft.block.*;
import net.minecraft.block.material.*;
import net.minecraft.client.*;
import net.minecraft.client.audio.*;
import net.minecraft.client.entity.*;
import net.minecraft.client.gui.*;
import net.minecraft.client.gui.achievement.*;
import net.minecraft.client.gui.inventory.*;
import net.minecraft.client.model.*;
import net.minecraft.client.multiplayer.*;
import net.minecraft.client.particle.*;
import net.minecraft.client.renderer.*;
import net.minecraft.client.renderer.culling.*;
import net.minecraft.client.renderer.entity.*;
import net.minecraft.client.renderer.tileentity.*;
import net.minecraft.client.settings.*;
import net.minecraft.client.texturepacks.*;
import net.minecraft.command.*;
import net.minecraft.crash.*;
import net.minecraft.creativetab.*;
import net.minecraft.dispenser.*;
import net.minecraft.enchantment.*;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.*;
import net.minecraft.entity.boss.*;
import net.minecraft.entity.effect.*;
import net.minecraft.entity.item.*;
import net.minecraft.entity.monster.*;
import net.minecraft.entity.passive.*;
import net.minecraft.entity.player.*;
import net.minecraft.entity.projectile.*;
import net.minecraft.inventory.*;
import net.minecraft.item.*;
import net.minecraft.item.crafting.*;
import net.minecraft.nbt.*;
import net.minecraft.network.*;
import net.minecraft.network.packet.*;
import net.minecraft.network.rcon.*;
import net.minecraft.pathfinding.*;
import net.minecraft.potion.*;
import net.minecraft.profiler.*;
import net.minecraft.server.*;
import net.minecraft.server.dedicated.*;
import net.minecraft.server.gui.*;
import net.minecraft.server.integrated.*;
import net.minecraft.server.management.*;
import net.minecraft.src.*;
import net.minecraft.stats.*;
import net.minecraft.tileentity.*;
import net.minecraft.util.*;
import net.minecraft.village.*;
import net.minecraft.world.*;
import net.minecraft.world.biome.*;
import net.minecraft.world.chunk.*;
import net.minecraft.world.chunk.storage.*;
import net.minecraft.world.demo.*;
import net.minecraft.world.gen.*;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.layer.*;
import net.minecraft.world.gen.structure.*;
import net.minecraft.world.storage.*;
import net.minecraftforge.*;
import net.minecraftforge.classloading.*;
import net.minecraftforge.client.*;
import net.minecraftforge.client.event.*;
import net.minecraftforge.client.event.sound.*;
import net.minecraftforge.common.*;
import net.minecraftforge.event.*;
import net.minecraftforge.event.entity.*;
import net.minecraftforge.event.entity.item.*;
import net.minecraftforge.event.entity.living.*;
import net.minecraftforge.event.entity.minecart.*;
import net.minecraftforge.event.entity.player.*;
import net.minecraftforge.event.terraingen.*;
import net.minecraftforge.event.world.*;
import net.minecraftforge.liquids.*;
import net.minecraftforge.oredict.*;
import net.minecraftforge.transformers.*;
import paulscode.*;import paulscode.sound.*;
import paulscode.sound.codecs.*;
import java.util.Random;

public class mod_Oarmor extends BaseMod{

public mod_Oarmor(){}

public static Item helmet;
public static Item body;
public static Item legs;
public static Item boots;
public void load(){
ModLoader.addName(helmet, "Armure en obsidienne Helmet");
ModLoader.addName(body, "Armure en obsidienne Body");
ModLoader.addName(legs, "Armure en obsidienne Legs");
ModLoader.addName(boots, "Armure en obsidienne Boots");
ModLoader.addRecipe(new ItemStack(helmet, 1), new Object[]{
	"0XX", "3XX", "XXX", Character.valueOf('0'), new ItemStack(Block.stone, 1), Character.valueOf('3'), new ItemStack(Block.stone, 1), 
});
ModLoader.addRecipe(new ItemStack(body, 1), new Object[]{
	"X1X", "X4X", "XXX", Character.valueOf('1'), new ItemStack(Block.stone, 1), Character.valueOf('4'), new ItemStack(Block.stone, 1), 
});
ModLoader.addRecipe(new ItemStack(legs, 1), new Object[]{
	"XX2", "XX5", "XXX", Character.valueOf('2'), new ItemStack(Block.stone, 1), Character.valueOf('5'), new ItemStack(Block.stone, 1), 
});
ModLoader.addRecipe(new ItemStack(boots, 1), new Object[]{
	"XXX", "XXX", "6X8", Character.valueOf('6'), new ItemStack(Block.stone, 1), Character.valueOf('8'), new ItemStack(Block.stone, 1), 
});

MinecraftForgeClient.preloadTexture("/");
helmet.setCreativeTab(CreativeTabs.tabCombat);
body.setCreativeTab(CreativeTabs.tabCombat);
legs.setCreativeTab(CreativeTabs.tabCombat);
boots.setCreativeTab(CreativeTabs.tabCombat);
}
public String getVersion(){
return "1.0";
}

static{
EnumArmorMaterial enuma = EnumHelper.addArmorMaterial("F", 30, new int[] {10, 10, 10, 10}, 15);
helmet = (new ItemArmor(1003, enuma, ModLoader.addArmor("obsidian_1"), 0)).setUnlocalizedName("helmetCloth");helmet.setMaxStackSize(1);
body = (new ItemArmor(1000, enuma, ModLoader.addArmor("obsidian_1"), 1)).setUnlocalizedName("chestplateCloth");body.setMaxStackSize(1);
legs = (new ItemArmor(1001, enuma, ModLoader.addArmor("obsidian_1"), 2)).setUnlocalizedName("leggingsCloth");legs.setMaxStackSize(1);
boots = (new ItemArmor(1002, enuma, ModLoader.addArmor("obsidian_1"), 3)).setUnlocalizedName("bootsCloth");boots.setMaxStackSize(1);

}

}
