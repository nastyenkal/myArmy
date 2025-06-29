package mephi.b23902.Model.GearFactory.MistyMounts;

import mephi.b23902.Model.GearFactory.Banner;
import mephi.b23902.Model.GearFactory.BannerType;

import static mephi.b23902.Model.GearFactory.BannerType.MOON_BANNER;

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
