package CallbackTest.Demo2;

/**
 * Created by Mccree on 01/12/2016.
 */
public class DownloadFiles {
    DownloadListener mListener;

    public void setDownloadListener(DownloadListener listener) {
        mListener = listener;
    }

    public void download() {
        System.out.println("开始下载");
        try {
            new Thread().sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        mListener.onDownloadComplete();
    }
}
