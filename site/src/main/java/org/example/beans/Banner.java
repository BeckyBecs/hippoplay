package org.example.beans;

import org.onehippo.cms7.essentials.dashboard.annotations.HippoEssentialsGenerated;
import org.hippoecm.hst.content.beans.Node;
import org.hippoecm.hst.content.beans.standard.HippoHtml;
import org.hippoecm.hst.content.beans.standard.HippoGalleryImageSet;
import org.hippoecm.hst.content.beans.standard.HippoBean;
import org.example.beans.Imageset;

@HippoEssentialsGenerated(internalName = "hippoplay:bannerdocument")
@Node(jcrType = "hippoplay:bannerdocument")
public class Banner extends BaseDocument {
	@HippoEssentialsGenerated(internalName = "hippoplay:title")
	public String getTitle() {
		return getProperty("hippoplay:title");
	}

	@HippoEssentialsGenerated(internalName = "hippoplay:content")
	public HippoHtml getContent() {
		return getHippoHtml("hippoplay:content");
	}

	@HippoEssentialsGenerated(internalName = "hippoplay:link")
	public HippoBean getLink() {
		return getLinkedBean("hippoplay:link", HippoBean.class);
	}

	@HippoEssentialsGenerated(internalName = "hippoplay:image")
	public Imageset getImage() {
		return getLinkedBean("hippoplay:image", Imageset.class);
	}
}
