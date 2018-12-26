package cn.eternal.easywxhongbao;

import android.view.accessibility.AccessibilityEvent;

public interface AccessbilityJob {
    String getTargetPackageName();
    void onCreateJob(QiangHongBaoService service);
    void onReceiveJob(AccessibilityEvent event);
    boolean isEnable();
}
