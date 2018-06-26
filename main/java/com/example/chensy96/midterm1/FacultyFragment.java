package com.example.chensy96.midterm1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class FacultyFragment extends android.app.Fragment {
    TextView nameTxt;
    TextView titleTxt;

    RecyclerView facultyRecyclerView;
    ProfessorAdapter pAdapter;

    public FacultyFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_faculty, container, false);

        facultyRecyclerView = (RecyclerView) v.findViewById(R.id.recycler_view);
        facultyRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        Faculty f = new Faculty(getActivity());
        pAdapter = new ProfessorAdapter(f.professorList);
        facultyRecyclerView.setAdapter(pAdapter);

        return v;
    }

    private class ProfessorHolder extends RecyclerView.ViewHolder implements View.OnClickListener
    {
        Professor currentProfessor;
        public ProfessorHolder (LayoutInflater inflater, ViewGroup parent)
        {
            super(inflater.inflate (R.layout.list_item_faculty, parent, false));
            nameTxt = (TextView) itemView.findViewById(R.id.nameVal);
            titleTxt = (TextView) itemView.findViewById(R.id.titleVal);

            itemView.setOnClickListener(this);
        }

        public void bind (Professor p)
        {
            this.currentProfessor = p;
            Log.d("Bind", p.getName());
            nameTxt.setText(p.getName());
            titleTxt.setText(p.getTitle());
        }

        @Override
        public void onClick(View view) {
            String currentName = currentProfessor.getName();
            String currentTitle = currentProfessor.getTitle();
            String currentOffice = currentProfessor.getOffice();
            String currentEmail = currentProfessor.getEmail();
            String currentIntro = currentProfessor.getIntro();
            int currentId = currentProfessor.getId();
            Intent intent = new Intent(getActivity().getApplicationContext(), IntroActivity.class);
            intent.putExtra("current", currentName);
            intent.putExtra("currentT", currentTitle);
            intent.putExtra("currentO", currentOffice);
            intent.putExtra("currentE", currentEmail);
            intent.putExtra("currentI", currentIntro);
            intent.putExtra("currentP", currentId);
            startActivity(intent);
        }
    }

    private class ProfessorAdapter extends RecyclerView.Adapter<ProfessorHolder>
    {
        private List<Professor> professor;
        public ProfessorAdapter(List<Professor> professorList)
        {
            professor = professorList;
        }

        public ProfessorHolder onCreateViewHolder(ViewGroup parent, int viewType)
        {
            LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext() );
            return new ProfessorHolder(layoutInflater, parent);
        }

        public int getItemCount()
        {
            Log.d("FacultyFragment" , "Size of list: " + professor.size());
            return professor.size();
        }

        public void onBindViewHolder (ProfessorHolder holder, int position)
        {
            Professor s = professor.get(position);
            holder.bind(s);
        }
    }

}