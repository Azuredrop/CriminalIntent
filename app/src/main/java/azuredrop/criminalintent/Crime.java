package azuredrop.criminalintent;

import java.util.Date;
import java.util.UUID;

/**
 * Created by Administrator on 2017/3/24.
 */

public class Crime {
    private UUID mId;
    private String mTitle;
    private Date mDate;
    private boolean mSolved;

    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public Date getDate() {
        return (mDate == null ? new Date() : mDate);
    }

    public void setDate(Date date) {
        mDate = date;
    }

    public boolean isSolved() {
        return mSolved;
    }

    public void setSolved(boolean solved) {
        mSolved = solved;
    }

    public Crime(){
        // 生成唯一标识符
        mId = UUID.randomUUID();
    }

    @Override
    public String toString() {
        return mTitle;
    }
}
