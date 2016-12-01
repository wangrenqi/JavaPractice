package CallbackTest.Demo2;

/**
 * Created by Mccree on 01/12/2016.
 */
public class Main {
    public static void main(String[] args) {

        DownloadFiles downloadFiles = new DownloadFiles();
        downloadFiles.setDownloadListener(() -> System.out.println("下载完成了！"));
        downloadFiles.download();
    }
}
