package workout.hfad.com.workout;


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class WorkoutDetailFragment extends Fragment {
    private long workoutID;

    public WorkoutDetailFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        if(savedInstanceState != null){
            workoutID = savedInstanceState.getLong("workoutID",workoutID);
        }
        return inflater.inflate(R.layout.fragment_workout_detail, container, false);
    }

    public void onStart(){
        super.onStart();
        View view = getView();//得到片段根视图的一个引用
        if(view!= null){//有view
            TextView title = (TextView) view.findViewById(R.id.textTile);
            Workout workout = Workout.workouts[(int) workoutID];//workout从数组workouts获取一个workout对象(通过ID)
            title.setText(workout.getName());
            TextView description = (TextView) view.findViewById(R.id.textDescription);
            description.setText(workout.getDescription());
        }
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        outState.putLong("workoutID",workoutID);
    }

    public void setWorkout(long id){
        this.workoutID = id;
    }

}
