package zeh.peaks.common.registry;

import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import zeh.peaks.Peaks;
import zeh.peaks.common.world.configuration.VeinConfiguration;
import zeh.peaks.common.world.configuration.WeightedRandomConfiguration;
import zeh.peaks.common.world.feature.VeinFeature;
import zeh.peaks.common.world.feature.WeightedRandomFeature;

import java.util.function.Supplier;

public class ModBiomeFeatures {

    public static final DeferredRegister<Feature<?>> FEATURES =
            DeferredRegister.create(ForgeRegistries.FEATURES, Peaks.MODID);

    public static final Supplier<Feature<VeinConfiguration>> VEINS =
            FEATURES.register("peak_gen", VeinFeature::new);

    public static final Supplier<Feature<WeightedRandomConfiguration>> WEIGHTEDLIST =
            FEATURES.register("weighted_random_selector", WeightedRandomFeature::new);

}