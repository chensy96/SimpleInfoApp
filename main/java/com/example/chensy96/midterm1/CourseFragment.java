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

public class CourseFragment extends android.app.Fragment {
    TextView nameTxt;
    TextView titleTxt;

    RecyclerView courseRecyclerView;
    ContentAdapter cAdapter;

    public CourseFragment() {
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
        View v = inflater.inflate(R.layout.fragment_course, container, false);

        courseRecyclerView = (RecyclerView) v.findViewById(R.id.recycler_view2);
        courseRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        Course c = new Course(getActivity());
        cAdapter = new ContentAdapter(c.contentList);
        courseRecyclerView.setAdapter(cAdapter);

        return v;
    }

    private class ContentHolder extends RecyclerView.ViewHolder implements View.OnClickListener
    {
        Content currentContent;
        public ContentHolder (LayoutInflater inflater, ViewGroup parent)
        {
            super(inflater.inflate (R.layout.list_item_faculty, parent, false));
            nameTxt = (TextView) itemView.findViewById(R.id.nameVal);
            titleTxt = (TextView) itemView.findViewById(R.id.titleVal);

            itemView.setOnClickListener(this);
        }

        public void bind (Content c)
        {
            this.currentContent = c;
            Log.d("Bind", c.getName());
            nameTxt.setText(c.getName());
            titleTxt.setText(c.getTitle());
        }

        @Override
        public void onClick(View view) {
            String currentName = currentContent.getName();
            String currentTitle = currentContent.getTitle();
            String currentCredits = currentContent.getCredits();
            String currentInfo = currentContent.getIntro();

            int currentPre = currentContent.getPre();

            Intent intent = new Intent(getActivity().getApplicationContext(), InfoActivity.class);
            intent.putExtra("current", currentName);
            intent.putExtra("currentT", currentTitle);
            intent.putExtra("currentC", currentCredits);
            intent.putExtra("currentI", currentInfo);
            intent.putExtra("currentPre", currentPre);
            startActivity(intent);
        }
    }

    private class ContentAdapter extends RecyclerView.Adapter<ContentHolder>
    {
        private List<Content> content;
        public ContentAdapter(List<Content> contentList)
        {
            content = contentList;
        }

        public ContentHolder onCreateViewHolder(ViewGroup parent, int viewType)
        {
            LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext() ); //getActivity());
            return new ContentHolder(layoutInflater, parent);
        }

        public int getItemCount()
        {
            Log.d("CourseFragment" , "Size of list: " + content.size());
            return content.size();
        }

        public void onBindViewHolder (ContentHolder holder, int position)
        {
            Content s = content.get(position);
            holder.bind(s);
        }
    }

}