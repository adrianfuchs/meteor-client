package minegame159.meteorclient.modules.setting;

import baritone.api.BaritoneAPI;
import baritone.api.Settings;
import minegame159.meteorclient.modules.Category;
import minegame159.meteorclient.modules.Module;
import minegame159.meteorclient.settings.BoolSetting;
import minegame159.meteorclient.settings.ColorSetting;
import minegame159.meteorclient.settings.DoubleSetting;
import minegame159.meteorclient.settings.IntSetting;
import minegame159.meteorclient.utils.Color;

public class Baritone extends Module {
    public Baritone() {
        super(Category.Setting, "baritone", "Some most of the most useful Baritone settings.", true, true, false);

        Settings s = BaritoneAPI.getSettings();

        // Allow
        addSetting(new BoolSetting.Builder()
                .name("allow-break")
                .description("Allow Baritone to break blocks.")
                .defaultValue(s.allowBreak.defaultValue)
                .onChanged(aBoolean -> s.allowBreak.value = aBoolean)
                .onModuleActivated(booleanSetting -> booleanSetting.set(s.allowBreak.value))
                .build()
        );
        addSetting(new BoolSetting.Builder()
                .name("allow-sprint")
                .description("Allow Baritone to sprint.")
                .defaultValue(s.allowSprint.defaultValue)
                .onChanged(aBoolean -> s.allowSprint.value = aBoolean)
                .onModuleActivated(booleanSetting -> booleanSetting.set(s.allowSprint.value))
                .build()
        );
        addSetting(new BoolSetting.Builder()
                .name("allow-place")
                .description("Allow Baritone to place blocks.")
                .defaultValue(s.allowPlace.defaultValue)
                .onChanged(aBoolean -> s.allowPlace.value = aBoolean)
                .onModuleActivated(booleanSetting -> booleanSetting.set(s.allowPlace.value))
                .build()
        );
        addSetting(new BoolSetting.Builder()
                .name("allow-inventory")
                .description("Allow Baritone to move items in your inventory to your hotbar.")
                .defaultValue(s.allowInventory.defaultValue)
                .onChanged(aBoolean -> s.allowInventory.value = aBoolean)
                .onModuleActivated(booleanSetting -> booleanSetting.set(s.allowInventory.value))
                .build()
        );
        addSetting(new BoolSetting.Builder()
                .name("allow-parkour")
                .description("Allow Baritone to perform parkour.")
                .defaultValue(s.allowParkour.defaultValue)
                .onChanged(aBoolean -> s.allowParkour.value = aBoolean)
                .onModuleActivated(booleanSetting -> booleanSetting.set(s.allowParkour.value))
                .build()
        );
        addSetting(new BoolSetting.Builder()
                .name("allow-parkour-place")
                .description("Allow Baritone to place blocks to perform parkour.")
                .defaultValue(s.allowParkourPlace.defaultValue)
                .onChanged(aBoolean -> s.allowParkourPlace.value = aBoolean)
                .onModuleActivated(booleanSetting -> booleanSetting.set(s.allowParkourPlace.value))
                .build()
        );
        addSetting(new BoolSetting.Builder()
                .name("allow-water-bucket-fall")
                .description("Allow Baritone to fall arbitrary distances and place a water bucket beneath it. Reliability: questionable.")
                .onChanged(aBoolean -> s.allowWaterBucketFall.value = aBoolean)
                .onModuleActivated(booleanSetting -> booleanSetting.set(s.allowWaterBucketFall.value))
                .build()
        );

        // Assume
        addSetting(new BoolSetting.Builder()
                .name("assume-walk-on-water")
                .description("Allow Baritone to assume it can walk on still water just like any other block. This functionality is assumed to be provided by a separate library that might have imported Baritone.")
                .defaultValue(s.assumeWalkOnWater.defaultValue)
                .onChanged(aBoolean -> s.assumeWalkOnWater.value = aBoolean)
                .onModuleActivated(booleanSetting -> booleanSetting.set(s.assumeWalkOnWater.value))
                .build()
        );
        addSetting(new BoolSetting.Builder()
                .name("assume-walk-on-lava")
                .description("If you have Fire Resistance and Jesus then I guess you could turn this on lol.")
                .defaultValue(s.assumeWalkOnLava.defaultValue)
                .onChanged(aBoolean -> s.assumeWalkOnLava.value = aBoolean)
                .onModuleActivated(booleanSetting -> booleanSetting.set(s.assumeWalkOnLava.value))
                .build()
        );
        addSetting(new BoolSetting.Builder()
                .name("assume-step")
                .description("Assume step functionality; don't jump on an Ascend.")
                .defaultValue(s.assumeStep.defaultValue)
                .onChanged(aBoolean -> s.assumeStep.value = aBoolean)
                .onModuleActivated(booleanSetting -> booleanSetting.set(s.assumeStep.value))
                .build()
        );
        addSetting(new BoolSetting.Builder()
                .name("assume-safe-walk")
                .description("Assume safe walk functionality; don't sneak on a backplace traverse.")
                .defaultValue(s.assumeSafeWalk.defaultValue)
                .onChanged(aBoolean -> s.assumeSafeWalk.value = aBoolean)
                .onModuleActivated(booleanSetting -> booleanSetting.set(s.assumeSafeWalk.value))
                .build()
        );

        // Render
        addSetting(new BoolSetting.Builder()
                .name("render-path")
                .description("Render the path.")
                .defaultValue(s.renderPath.defaultValue)
                .onChanged(aBoolean -> s.renderPath.value = aBoolean)
                .onModuleActivated(booleanSetting -> booleanSetting.set(s.renderPath.value))
                .build()
        );
        addSetting(new BoolSetting.Builder()
                .name("render-path-as-line")
                .description("Render the path as line instead of a frickin thingy.")
                .defaultValue(s.renderPathAsLine.defaultValue)
                .onChanged(aBoolean -> s.renderPathAsLine.value = aBoolean)
                .onModuleActivated(booleanSetting -> booleanSetting.set(s.renderPathAsLine.value))
                .build()
        );
        addSetting(new BoolSetting.Builder()
                .name("render-goal")
                .description("Render the goal.")
                .defaultValue(s.renderGoal.defaultValue)
                .onChanged(aBoolean -> s.renderGoal.value = aBoolean)
                .onModuleActivated(booleanSetting -> booleanSetting.set(s.renderGoal.value))
                .build()
        );
        addSetting(new BoolSetting.Builder()
                .name("render-selection-boxes")
                .description("Render the selection boxes.")
                .defaultValue(s.renderSelectionBoxes.defaultValue)
                .onChanged(aBoolean -> s.renderSelectionBoxes.value = aBoolean)
                .onModuleActivated(booleanSetting -> booleanSetting.set(s.renderSelectionBoxes.value))
                .build()
        );
        addSetting(new BoolSetting.Builder()
                .name("render-goal-ignore-depth")
                .description("Ignore depth when rendering the goal")
                .defaultValue(s.renderGoalIgnoreDepth.defaultValue)
                .onChanged(aBoolean -> s.renderGoalIgnoreDepth.value = aBoolean)
                .onModuleActivated(booleanSetting -> booleanSetting.set(s.renderGoalIgnoreDepth.value))
                .build()
        );
        addSetting(new BoolSetting.Builder()
                .name("render-goal-XZ-beacon")
                .description("Renders X/Z type Goals with the vanilla beacon beam effect. Combining this with renderGoalIgnoreDepth will cause strange render clipping.")
                .defaultValue(s.renderGoalXZBeacon.defaultValue)
                .onChanged(aBoolean -> s.renderGoalXZBeacon.value = aBoolean)
                .onModuleActivated(booleanSetting -> booleanSetting.set(s.renderGoalXZBeacon.value))
                .build()
        );
        addSetting(new BoolSetting.Builder()
                .name("render-path-ignore-deph")
                .description("Ignore path when rendering the path.")
                .defaultValue(s.renderPathIgnoreDepth.defaultValue)
                .onChanged(aBoolean -> s.renderPathIgnoreDepth.value = aBoolean)
                .onModuleActivated(booleanSetting -> booleanSetting.set(s.renderPathIgnoreDepth.value))
                .build()
        );
        addSetting(new BoolSetting.Builder()
                .name("render-selection")
                .description("Render the selections.")
                .defaultValue(s.renderSelection.defaultValue)
                .onChanged(aBoolean -> s.renderSelection.value = aBoolean)
                .onModuleActivated(booleanSetting -> booleanSetting.set(s.renderSelection.value))
                .build()
        );
        addSetting(new BoolSetting.Builder()
                .name("render-selection-ignore-depth")
                .description("Ignore depth when rendering selection.")
                .defaultValue(s.renderSelectionBoxesIgnoreDepth.defaultValue)
                .onChanged(aBoolean -> s.renderSelectionIgnoreDepth.value = aBoolean)
                .onModuleActivated(booleanSetting -> booleanSetting.set(s.renderSelectionIgnoreDepth.value))
                .build()
        );
        addSetting(new BoolSetting.Builder()
                .name("render-selection-corners.")
                .description("Render the selection corners.")
                .defaultValue(s.renderSelectionCorners.defaultValue)
                .onChanged(aBoolean -> s.renderSelectionCorners.value = aBoolean)
                .onModuleActivated(booleanSetting -> booleanSetting.set(s.renderSelectionCorners.value))
                .build()
        );

        // Penalties
        addSetting(new DoubleSetting.Builder()
                .name("block-placement-penalty")
                .description("Decrease to make Baritone more often consider would require placing blocks.")
                .defaultValue(s.blockPlacementPenalty.defaultValue)
                .onChanged(aDouble -> s.blockPlacementPenalty.value = aDouble)
                .onModuleActivated(doubleSetting -> doubleSetting.set(s.blockPlacementPenalty.value))
                .min(0)
                .build()
        );
        addSetting(new DoubleSetting.Builder()
                .name("block-break-additional-penalty")
                .description("This is just a tiebreaker to make it less likely to break blocks if it can avoid it.")
                .defaultValue(s.blockBreakAdditionalPenalty.defaultValue)
                .onChanged(aDouble -> s.blockBreakAdditionalPenalty.value = aDouble)
                .onModuleActivated(doubleSetting -> doubleSetting.set(s.blockBreakAdditionalPenalty.value))
                .min(0)
                .build()
        );
        addSetting(new DoubleSetting.Builder()
                .name("jump-penalty")
                .description("Additional penalty for hitting the space bar (ascend, pillar, or parkour) because it uses hunger.")
                .defaultValue(s.jumpPenalty.defaultValue)
                .onChanged(aDouble -> s.jumpPenalty.value = aDouble)
                .onModuleActivated(doubleSetting -> doubleSetting.set(s.jumpPenalty.value))
                .min(0)
                .build()
        );
        addSetting(new DoubleSetting.Builder()
                .name("walk-on-water-penalty")
                .description("Walking on water uses up hunger really quick, so penalize it.")
                .defaultValue(s.walkOnWaterOnePenalty.defaultValue)
                .onChanged(aDouble -> s.walkOnWaterOnePenalty.value = aDouble)
                .onModuleActivated(doubleSetting -> doubleSetting.set(s.walkOnWaterOnePenalty.value))
                .min(0)
                .build()
        );

        // Colors
        addSetting(new ColorSetting.Builder()
                .name("color-current-path")
                .description("The color of the current path.")
                .defaultValue(new Color(s.colorCurrentPath.defaultValue))
                .onChanged(color1 -> s.colorCurrentPath.value = new java.awt.Color(color1.getPacked(), true))
                .onModuleActivated(colorSetting -> colorSetting.set(new Color(s.colorCurrentPath.value.getRGB())))
                .build()
        );
        addSetting(new ColorSetting.Builder()
                .name("color-next-path")
                .description("The color of the next path.")
                .defaultValue(new Color(s.colorNextPath.defaultValue))
                .onChanged(color1 -> s.colorNextPath.value = new java.awt.Color(color1.getPacked(), true))
                .onModuleActivated(colorSetting -> colorSetting.set(new Color(s.colorNextPath.value.getRGB())))
                .build()
        );
        addSetting(new ColorSetting.Builder()
                .name("color-blocks-to-break")
                .description("The color of the blocks to break.")
                .defaultValue(new Color(s.colorBlocksToBreak.defaultValue))
                .onChanged(color1 -> s.colorBlocksToBreak.value = new java.awt.Color(color1.getPacked(), true))
                .onModuleActivated(colorSetting -> colorSetting.set(new Color(s.colorBlocksToBreak.value.getRGB())))
                .build()
        );
        addSetting(new ColorSetting.Builder()
                .name("color-blocks-to-place")
                .description("The color of the blocks to place.")
                .defaultValue(new Color(s.colorBlocksToPlace.defaultValue))
                .onChanged(color1 -> s.colorBlocksToPlace.value = new java.awt.Color(color1.getPacked(), true))
                .onModuleActivated(colorSetting -> colorSetting.set(new Color(s.colorBlocksToPlace.value.getRGB())))
                .build()
        );
        addSetting(new ColorSetting.Builder()
                .name("color-blocks-to-walk-into")
                .description("The color of the blocks to walk into.")
                .defaultValue(new Color(s.colorBlocksToWalkInto.defaultValue))
                .onChanged(color1 -> s.colorBlocksToWalkInto.value = new java.awt.Color(color1.getPacked(), true))
                .onModuleActivated(colorSetting -> colorSetting.set(new Color(s.colorBlocksToWalkInto.value.getRGB())))
                .build()
        );
        addSetting(new ColorSetting.Builder()
                .name("color-best-path-so-far")
                .description("The color of the best path so far.")
                .defaultValue(new Color(s.colorBestPathSoFar.defaultValue))
                .onChanged(color1 -> s.colorBestPathSoFar.value = new java.awt.Color(color1.getPacked(), true))
                .onModuleActivated(colorSetting -> colorSetting.set(new Color(s.colorBestPathSoFar.value.getRGB())))
                .build()
        );
        addSetting(new ColorSetting.Builder()
                .name("color-most-recent-considered")
                .description("The color of the most recent considered node.")
                .defaultValue(new Color(s.colorMostRecentConsidered.defaultValue))
                .onChanged(color1 -> s.colorMostRecentConsidered.value = new java.awt.Color(color1.getPacked(), true))
                .onModuleActivated(colorSetting -> colorSetting.set(new Color(s.colorMostRecentConsidered.value.getRGB())))
                .build()
        );
        addSetting(new ColorSetting.Builder()
                .name("color-goal-box")
                .description("The color of the goal box.")
                .defaultValue(new Color(s.colorGoalBox.defaultValue))
                .onChanged(color1 -> s.colorGoalBox.value = new java.awt.Color(color1.getPacked(), true))
                .onModuleActivated(colorSetting -> colorSetting.set(new Color(s.colorGoalBox.value.getRGB())))
                .build()
        );
        addSetting(new ColorSetting.Builder()
                .name("color-inverted-goal-box")
                .description("The color of the goal box when it's inverted.")
                .defaultValue(new Color(s.colorInvertedGoalBox.defaultValue))
                .onChanged(color1 -> s.colorInvertedGoalBox.value = new java.awt.Color(color1.getPacked(), true))
                .onModuleActivated(colorSetting -> colorSetting.set(new Color(s.colorInvertedGoalBox.value.getRGB())))
                .build()
        );
        addSetting(new ColorSetting.Builder()
                .name("color-selection")
                .description("The color of all selections.")
                .defaultValue(new Color(s.colorSelection.defaultValue))
                .onChanged(color1 -> s.colorSelection.value = new java.awt.Color(color1.getPacked(), true))
                .onModuleActivated(colorSetting -> colorSetting.set(new Color(s.colorSelection.value.getRGB())))
                .build()
        );
        addSetting(new ColorSetting.Builder()
                .name("color-selection-pos-1")
                .description("The color of the selection pos 1.")
                .defaultValue(new Color(s.colorSelectionPos1.defaultValue))
                .onChanged(color1 -> s.colorSelectionPos1.value = new java.awt.Color(color1.getPacked(), true))
                .onModuleActivated(colorSetting -> colorSetting.set(new Color(s.colorSelectionPos1.value.getRGB())))
                .build()
        );
        addSetting(new ColorSetting.Builder()
                .name("color-selection-pos-2")
                .description("The color of the selection pos 2.")
                .defaultValue(new Color(s.colorSelectionPos2.defaultValue))
                .onChanged(color1 -> s.colorSelectionPos2.value = new java.awt.Color(color1.getPacked(), true))
                .onModuleActivated(colorSetting -> colorSetting.set(new Color(s.colorSelectionPos2.value.getRGB())))
                .build()
        );

        // Other
        addSetting(new BoolSetting.Builder()
                .name("legit-mine")
                .description("Disallow MineBehavior from using X-Ray to see where the ores are. Turn this option on to force it to mine \"legit\" where it will only mine an ore once it can actually see it, so it won't do or know anything that a normal player couldn't. If you don't want it to look like you're X-Raying, turn this on.")
                .defaultValue(s.legitMine.defaultValue)
                .onChanged(aBoolean -> s.legitMine.value = aBoolean)
                .onModuleActivated(booleanSetting -> booleanSetting.set(s.legitMine.value))
                .build()
        );
        addSetting(new BoolSetting.Builder()
                .name("backfill")
                .description("Fill in blocks behind you")
                .defaultValue(s.backfill.defaultValue)
                .onChanged(aBoolean -> s.backfill.value = aBoolean)
                .onModuleActivated(booleanSetting -> booleanSetting.set(s.backfill.value))
                .build()
        );
        addSetting(new IntSetting.Builder()
                .name("follow-radius")
                .description("The radius (for the GoalNear) of how close to your target position you actually have to be.")
                .defaultValue(s.followRadius.defaultValue)
                .onChanged(integer -> s.followRadius.value = integer)
                .onModuleActivated(doubleSetting -> doubleSetting.set(s.followRadius.value))
                .min(0)
                .build()
        );
        addSetting(new BoolSetting.Builder()
                .name("build-in-layers")
                .description("Don't consider the next layer in builder until the current one is done.")
                .defaultValue(s.buildInLayers.defaultValue)
                .onChanged(aBoolean -> s.buildInLayers.value = aBoolean)
                .onModuleActivated(booleanSetting -> booleanSetting.set(s.buildInLayers.value))
                .build()
        );
        addSetting(new BoolSetting.Builder()
                .name("layer-order")
                .description("false = build from bottom to top, true = build from top to bottom")
                .defaultValue(s.layerOrder.defaultValue)
                .onChanged(aBoolean -> s.layerOrder.value = aBoolean)
                .onModuleActivated(booleanSetting -> booleanSetting.set(s.layerOrder.value))
                .build()
        );
        addSetting(new BoolSetting.Builder()
                .name("mine-scan-dropped-items")
                .description("While mining, should it also consider dropped items of the correct type as a pathing destination (as well as ore blocks)?")
                .defaultValue(s.mineScanDroppedItems.defaultValue)
                .onChanged(aBoolean -> s.mineScanDroppedItems.value = aBoolean)
                .onModuleActivated(booleanSetting -> booleanSetting.set(s.mineScanDroppedItems.value))
                .build()
        );
        addSetting(new BoolSetting.Builder()
                .name("anti-cheat-compatibility")
                .description("Will cause some minor behavioral differences to ensure that Baritone works on anticheats.")
                .defaultValue(s.antiCheatCompatibility.defaultValue)
                .onChanged(aBoolean -> s.antiCheatCompatibility.value = aBoolean)
                .onModuleActivated(booleanSetting -> booleanSetting.set(s.antiCheatCompatibility.value))
                .build()
        );
        addSetting(new BoolSetting.Builder()
                .name("censor-coordinates")
                .description("Censor coordinates in goals and block positions.")
                .defaultValue(s.censorCoordinates.defaultValue)
                .onChanged(aBoolean -> s.censorCoordinates.value = aBoolean)
                .onModuleActivated(booleanSetting -> booleanSetting.set(s.censorCoordinates.value))
                .build()
        );
        addSetting(new BoolSetting.Builder()
                .name("censor-ran-commands")
                .description("Censor arguments to ran commands, to hide, for example, coordinates to @goal.")
                .defaultValue(s.censorRanCommands.defaultValue)
                .onChanged(aBoolean -> s.censorRanCommands.value = aBoolean)
                .onModuleActivated(booleanSetting -> booleanSetting.set(s.censorRanCommands.value))
                .build()
        );
        addSetting(new BoolSetting.Builder()
                .name("container-memory")
                .description("Remember the contents of containers (chests, echests, furnaces).")
                .defaultValue(s.containerMemory.defaultValue)
                .onChanged(aBoolean -> s.containerMemory.value = aBoolean)
                .onModuleActivated(booleanSetting -> booleanSetting.set(s.containerMemory.value))
                .build()
        );
        addSetting(new BoolSetting.Builder()
                .name("desktop-notifications")
                .description("Desktop notifications.")
                .defaultValue(s.desktopNotifications.defaultValue)
                .onChanged(aBoolean -> s.desktopNotifications.value = aBoolean)
                .onModuleActivated(booleanSetting -> booleanSetting.set(s.desktopNotifications.value))
                .build()
        );
        addSetting(new BoolSetting.Builder()
                .name("echo-commands")
                .description("Echo commands to chat when they are run.")
                .defaultValue(s.echoCommands.defaultValue)
                .onChanged(aBoolean -> s.echoCommands.value = aBoolean)
                .onModuleActivated(booleanSetting -> booleanSetting.set(s.echoCommands.value))
                .build()
        );
        addSetting(new BoolSetting.Builder()
                .name("enter-portal.")
                .description("When running a goto towards a nether portal block, walk all the way into the portal instead of stopping one block before.")
                .defaultValue(s.enterPortal.defaultValue)
                .onChanged(aBoolean -> s.enterPortal.value = aBoolean)
                .onModuleActivated(booleanSetting -> booleanSetting.set(s.enterPortal.value))
                .build()
        );
        addSetting(new BoolSetting.Builder()
                .name("free-look")
                .description("Move without having to force the client-sided rotations.")
                .defaultValue(s.freeLook.defaultValue)
                .onChanged(aBoolean -> s.freeLook.value = aBoolean)
                .onModuleActivated(booleanSetting -> booleanSetting.set(s.freeLook.value))
                .build()
        );
        addSetting(new BoolSetting.Builder()
                .name("map-art-mode")
                .description("Build in map art mode, which makes baritone only care about the top block in each column.")
                .defaultValue(s.mapArtMode.defaultValue)
                .onChanged(aBoolean -> s.mapArtMode.value = aBoolean)
                .onModuleActivated(booleanSetting -> booleanSetting.set(s.mapArtMode.value))
                .build()
        );
        addSetting(new IntSetting.Builder()
                .name("max-fall-height-bucket")
                .description("How far are you allowed to fall onto solid ground (with a water bucket)? It's not that reliable, so I've set it below what would kill an unarmored player (23).")
                .defaultValue(s.maxFallHeightBucket.defaultValue)
                .onChanged(integer -> s.maxFallHeightBucket.value = integer)
                .onModuleActivated(doubleSetting -> doubleSetting.set(s.maxFallHeightBucket.value))
                .min(0)
                .build()
        );
        addSetting(new IntSetting.Builder()
                .name("max-fall-height-no-water")
                .description("How far are you allowed to fall onto solid ground (without a water bucket)? 3 won't deal any damage.")
                .defaultValue(s.maxFallHeightNoWater.defaultValue)
                .onChanged(integer -> s.maxFallHeightNoWater.value = integer)
                .onModuleActivated(doubleSetting -> doubleSetting.set(s.maxFallHeightNoWater.value))
                .min(0)
                .build()
        );
        addSetting(new BoolSetting.Builder()
                .name("prefer-silk-touch")
                .description("Always prefer silk touch tools over regular tools.")
                .defaultValue(s.preferSilkTouch.defaultValue)
                .onChanged(aBoolean -> s.preferSilkTouch.value = aBoolean)
                .onModuleActivated(booleanSetting -> booleanSetting.set(s.preferSilkTouch.value))
                .build()
        );
        addSetting(new BoolSetting.Builder()
                .name("replant-crops")
                .description("Replant normal Crops while farming and leave cactus and sugarcane to regrow.")
                .defaultValue(s.replantCrops.defaultValue)
                .onChanged(aBoolean -> s.replantCrops.value = aBoolean)
                .onModuleActivated(booleanSetting -> booleanSetting.set(s.replantCrops.value))
                .build()
        );
        addSetting(new BoolSetting.Builder()
                .name("replant-nether-wart")
                .description("Replant nether wart while farming.")
                .defaultValue(s.replantNetherWart.defaultValue)
                .onChanged(aBoolean -> s.replantNetherWart.value = aBoolean)
                .onModuleActivated(booleanSetting -> booleanSetting.set(s.replantNetherWart.value))
                .build()
        );
        addSetting(new BoolSetting.Builder()
                .name("sprint-in-water")
                .description("Continue sprinting while in water.")
                .defaultValue(s.sprintInWater.defaultValue)
                .onChanged(aBoolean -> s.sprintInWater.value = aBoolean)
                .onModuleActivated(booleanSetting -> booleanSetting.set(s.sprintInWater.value))
                .build()
        );
    }
}