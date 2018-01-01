package workout.hfad.com.workout;

import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements WorkoutListFragment.WorkoutListListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       // WorkoutDetailFragment frag = (WorkoutDetailFragment) getFragmentManager().findFragmentById(R.id.detail_frag);
        //frag.setWorkout(1);
    }

    public void itemClicked(long id){//利用接口，单击一项时让详细信息做出相应的改变
        WorkoutDetailFragment details = new WorkoutDetailFragment();
        details.setWorkout(id);
        FragmentTransaction ft = getFragmentManager().beginTransaction();
        ft.replace(R.id.fragment_container,details);
        ft.addToBackStack(null);
        ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);//过度动画：淡入淡出
        ft.commit();//向活动提交修改
    }
}