package de.wichmann.sevdesk.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-04-26T00:58:42.052+02:00[Europe/Berlin]")
@JsonRootName(value = "objects")
public class ModelRender
{
	@JsonProperty(value = "pdfUrl")
	private String pdfUrl;

	public String getPdfUrl()
	{
		return pdfUrl;
	}

	public void setPdfUrl(String pdfUrl)
	{
		this.pdfUrl = pdfUrl;
	}
}
