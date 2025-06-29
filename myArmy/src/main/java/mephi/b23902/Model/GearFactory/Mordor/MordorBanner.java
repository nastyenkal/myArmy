package org.example.Model.GearFactory.Mordor;

import org.example.Model.GearFactory.Banner;
import org.example.Model.GearFactory.BannerType;

import static org.example.Model.GearFactory.BannerType.RED_EYE_BANNER;

public class MordorBanner implements Banner {
    BannerType banner;

    public MordorBanner() {
        banner = RED_EYE_BANNER;
    }

    @Override
    public String toString() {
        return banner.getBanner();
    }
}
