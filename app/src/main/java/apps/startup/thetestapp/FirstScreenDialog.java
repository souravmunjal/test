package apps.startup.thetestapp;

import android.app.Dialog;
import android.databinding.DataBindingUtil;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;
import apps.startup.thetestapp.databinding.DialogFirstScreenMashBinding;

public class FirstScreenDialog extends BaseDialogFragment {
    public static FirstScreenDialog newInstance() {
        FirstScreenDialog fullImageDialog = new FirstScreenDialog();
        return fullImageDialog;
    }
    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        final View dialogView = getActivity().getLayoutInflater()
                .inflate(R.layout.dialog_first_screen_mash, new LinearLayout(getActivity()),
                        false);
        DialogFirstScreenMashBinding binding= DataBindingUtil.bind(dialogView);
        Dialog builder = new Dialog(getActivity(),R.style.CustomDialog);
        builder.requestWindowFeature(Window.FEATURE_NO_TITLE);
        if (builder.getWindow() != null) {
            builder.getWindow()
                    .setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
        }
        builder.setContentView(dialogView);
        return builder;
    }
}
