package org.example.Model.GearFactory.Dolguldur;

import org.example.Model.GearFactory.Banner;
import org.example.Model.GearFactory.BannerType;

import static org.example.Model.GearFactory.BannerType.*;

public class DolguldurBanner implements Banner {
    BannerType banner;

    public DolguldurBanner() {
        banner = SPIDER_BANNER;
    }

    @Override
    public String toString() {
        return banner.getBanner();
    }
}
