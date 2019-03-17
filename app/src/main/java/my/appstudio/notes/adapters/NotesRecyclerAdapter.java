package my.appstudio.notes.adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import my.appstudio.notes.R;
import my.appstudio.notes.models.Note;

//public class NotesRecyclerAdapter extends RecyclerView.Adapter<NotesRecyclerAdapter.ViewHolder> {
//    private ArrayList<Note> mNotes = new ArrayList<>();
//
//    public NotesRecyclerAdapter(ArrayList<Note> mNotes) {
//        this.mNotes = mNotes;
//    }
//
//    @NonNull
//    @Override
//    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
//        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_note_list_item, viewGroup, false);
//        return new ViewHolder(view);
//    }
//
//    @Override
//    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
//        viewHolder.timestamp.setText(mNotes.get(i).getTimestamp());
//        viewHolder.title.setText(mNotes.get(i).getTitle());
//    }
//
//    @Override
//    public int getItemCount() {
//        return mNotes.size();
//    }
//
//    public class ViewHolder extends RecyclerView.ViewHolder {
//
//        private TextView title, timestamp;
//
//        public ViewHolder(@NonNull View itemView) {
//            super(itemView);
//            title = itemView.findViewById(R.id.note_title);
//            timestamp = itemView.findViewById(R.id.note_timestamp);
//        }
//    }
//}

public class NotesRecyclerAdapter extends RecyclerView.Adapter<NotesRecyclerAdapter.ViewHolder> {
    private ArrayList<Note> mNotes = new ArrayList<>();

    public NotesRecyclerAdapter(ArrayList<Note> mNotes) {
        this.mNotes = mNotes;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_note_list_item, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        viewHolder.title.setText(mNotes.get(i).getTitle());
        viewHolder.timestamp.setText(mNotes.get(i).getTimestamp());
    }

    @Override
    public int getItemCount() {
        return mNotes.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView title, timestamp;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.note_title);
            timestamp = itemView.findViewById(R.id.note_timestamp);
        }
    }
}