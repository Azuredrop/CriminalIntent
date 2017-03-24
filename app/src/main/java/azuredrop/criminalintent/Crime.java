package azuredrop.criminalintent;

import java.util.UUID;

/**
 * Created by Administrator on 2017/3/24.
 */

public class Crime {
    private UUID mId;
    private String mTitle;

    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public Crime(){
        // 生成唯一标识符
        mId = UUID.randomUUID();
    }
}
