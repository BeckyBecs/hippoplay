package org.example.beans;

import org.onehippo.cms7.essentials.dashboard.annotations.HippoEssentialsGenerated;
import org.hippoecm.hst.content.beans.Node;
import org.hippoecm.hst.content.beans.standard.HippoGalleryImageSet;
import org.hippoecm.hst.content.beans.standard.HippoGalleryImageBean;

@HippoEssentialsGenerated(internalName = "hippoplay:imageset")
@Node(jcrType = "hippoplay:imageset")
public class Imageset extends HippoGalleryImageSet {
	@HippoEssentialsGenerated(internalName = "hippoplay:small")
	public HippoGalleryImageBean getSmall() {
		return getBean("hippoplay:small", HippoGalleryImageBean.class);
	}

	@HippoEssentialsGenerated(internalName = "hippoplay:large")
	public HippoGalleryImageBean getLarge() {
		return getBean("hippoplay:large", HippoGalleryImageBean.class);
	}

	@HippoEssentialsGenerated(internalName = "hippoplay:smallsquare")
	public HippoGalleryImageBean getSmallsquare() {
		return getBean("hippoplay:smallsquare", HippoGalleryImageBean.class);
	}

	@HippoEssentialsGenerated(internalName = "hippoplay:mediumsquare")
	public HippoGalleryImageBean getMediumsquare() {
		return getBean("hippoplay:mediumsquare", HippoGalleryImageBean.class);
	}

	@HippoEssentialsGenerated(internalName = "hippoplay:largesquare")
	public HippoGalleryImageBean getLargesquare() {
		return getBean("hippoplay:largesquare", HippoGalleryImageBean.class);
	}

	@HippoEssentialsGenerated(internalName = "hippoplay:banner")
	public HippoGalleryImageBean getBanner() {
		return getBean("hippoplay:banner", HippoGalleryImageBean.class);
	}
}
