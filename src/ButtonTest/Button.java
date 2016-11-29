package ButtonTest;

/**
 * Created by Mccree on 24/11/2016.
 */
public class Button {


    public void setOnClickListenrer(OnClickListener listenrer) {
        listenrer.onClick();
    }

    interface OnClickListener{
        void onClick();
    }

}
