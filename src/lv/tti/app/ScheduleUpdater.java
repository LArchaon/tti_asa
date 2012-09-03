package lv.tti.app;

import android.content.Context;
import lv.tti.app.models.User;

public interface ScheduleUpdater {
    Context getContext();
    void updateSchedule(User user);
}
