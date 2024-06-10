package com.arrow;

import com.arrow.item.modItem;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class explodingArrow implements ModInitializer {
	public static final String MOD_ID = "explodingarrow";
    public static final Logger LOGGER = LoggerFactory.getLogger("MOD_ID");

	@Override
	public void onInitialize() {

		modItem.registermodItem();

	}
}