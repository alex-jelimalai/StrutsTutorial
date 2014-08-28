package manning.ch3;

import com.opensymphony.xwork2.ActionSupport;
import manning.ch3.utils.PortfolioService;

import java.io.File;

/**
 * User: Alexandr Jelimalai
 */
public class ImageUpload extends ActionSupport{
    private File pic;
    private String picContentType;
    private String picFileName;

    public String execute() {
        getPortfolioService().addImage(getPic());
        return SUCCESS;
    }

    public File getPic() {
        return pic;
    }

    public void setPic(File pic) {
        this.pic = pic;
    }

    public String getPicContentType() {
        return picContentType;
    }

    public void setPicContentType(String picContentType) {
        this.picContentType = picContentType;
    }

    public String getPicFileName() {
        return picFileName;
    }

    public void setPicFileName(String picFileName) {
        this.picFileName = picFileName;
    }

    public PortfolioService getPortfolioService() {
        return new PortfolioService();
    }
}
