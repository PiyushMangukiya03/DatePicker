package mr.pm.datepicker.utils;

import android.view.Gravity;

import mr.pm.datepicker.R;

/**
 * Created by Sai on 15/8/9.
 */
public class DateTimeOptionPickerViewAnimateUtil {
    private static final int INVALID = -1;

    /**
     * Get default animation resource when not defined by the user
     *
     * @param gravity       the gravity of the dialog
     * @param isInAnimation determine if is in or out animation. true when is is
     * @return the id of the animation resource
     */
    public static int getAnimationResource(int gravity, boolean isInAnimation) {
        switch (gravity) {
            case Gravity.BOTTOM:
                return isInAnimation ? R.anim.datetimeoptionspicker_slide_in_bottom : R.anim.datetimeoptionspicker_slide_out_bottom;
        }
        return INVALID;
    }
}
