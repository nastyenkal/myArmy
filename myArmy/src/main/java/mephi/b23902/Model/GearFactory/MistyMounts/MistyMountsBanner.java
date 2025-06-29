package org.example.Model.GearFactory.MistyMounts;

import org.example.Model.GearFactory.Banner;
import org.example.Model.GearFactory.BannerType;

import static org.example.Model.GearFactory.BannerType.MOON_BANNER;

public class MistyMountsBanner implements Banner {
    BannerType banner;

    public MistyMountsBanner() {
        banner = MOON_BANNER;
    }

    @Override
    public String toString() {
        return banner.getBanner();
    }
}
