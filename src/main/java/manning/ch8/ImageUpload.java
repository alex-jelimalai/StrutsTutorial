package manning.ch8;


import com.opensymphony.xwork2.ActionSupport;
import manning.ch8.utils.PortfolioService;

import java.io.File;
import java.io.IOException;

/*
 * This action uploads an image file using the default fileUpload 
 * interceptor.  The interceptor is in the default stack and the only
 * thing we have to do here in the action is implement JavaBean's 
 * properties to receive the File and meta-data from the interceptor.
 */

public class ImageUpload extends ActionSupport {


    File pic;


    /* JavaBeans Properties to Receive Request Parameters */
    String picContentType;
    String picFileName;
    String fileSystemPath;

    public String execute() {


        //add image to account

        try {
            getPortfolioService().addImage(getPic(), getPicFileName(), fileSystemPath);
        } catch (IOException e) {
            e.printStackTrace();
        }

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

    void setPicContentType(String picContentType) {
        this.picContentType = picContentType;
    }

    public String getPicFileName() {
        return picFileName;
    }

    public void setPicFileName(String picFileName) {
        this.picFileName = picFileName;
    }

    public void setFileSystemPath(String fileSystemPath) {
        this.fileSystemPath = fileSystemPath;
    }

    /*
     * Simple way to retrieve our business logic and data persistence object.
     * Late versions of the portfolio app will integrate with more
     * sophisticated technologies for these services.
     */
    public PortfolioService getPortfolioService() {

        return new PortfolioService();

    }


}
