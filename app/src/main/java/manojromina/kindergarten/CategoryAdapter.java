package manojromina.kindergarten;

/**
 * Created by manoj on 3/28/2017.
 */
import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


public class CategoryAdapter extends FragmentPagerAdapter {

    private Context mContext;

    //context will help to locate which fragment is currently on
    // the fragment manager that will keep each fragment's state in the adapter across swipes.
    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    //defining the position of the tab
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new AlphabetFragment();
        } else if (position == 1) {
            return new NumberFragment();
        } else if (position == 2) {
            return new ColorsFragment();
        } else {
            return new PoemFragment();
        }
    }

    //since there are 4 tab so it will return four
    @Override
    public int getCount() {
        return 4;


    }

    //getting the page title according to the position
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.category_alphabet);
        } else if (position == 1) {
            return mContext.getString(R.string.category_numbers);
        } else if (position == 2) {
            return mContext.getString(R.string.category_colors);
        } else {
            return mContext.getString(R.string.category_poem);
        }
    }
}
