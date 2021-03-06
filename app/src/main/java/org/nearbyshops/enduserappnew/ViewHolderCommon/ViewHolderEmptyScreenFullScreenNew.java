package org.nearbyshops.enduserappnew.ViewHolderCommon;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import org.nearbyshops.enduserappnew.R;
import org.nearbyshops.enduserappnew.ViewHolderCommon.Models.EmptyScreenDataFullScreen;


public class ViewHolderEmptyScreenFullScreenNew extends RecyclerView.ViewHolder{




    @BindView(R.id.graphic_image) ImageView graphicImage;
    @BindView(R.id.title) TextView title;
    @BindView(R.id.message) TextView message;
    @BindView(R.id.copyrights) TextView designedByFreepik;



    private Context context;
    private EmptyScreenDataFullScreen item;




    public static ViewHolderEmptyScreenFullScreenNew create(ViewGroup parent, Context context)
    {

        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item_empty_screen_full_screen,parent,false);

        return new ViewHolderEmptyScreenFullScreenNew(view,context);
    }





    public ViewHolderEmptyScreenFullScreenNew(View itemView, Context context) {
        super(itemView);

        ButterKnife.bind(this,itemView);
        this.context = context;
    }





    public void setItem(EmptyScreenDataFullScreen data)
    {
        title.setText(data.getTitle());
        message.setText(data.getMessage());
        graphicImage.setImageResource(data.getDrawableResource());

        if(data.isShowDesignedByFreepik())
        {
            designedByFreepik.setVisibility(View.VISIBLE);
        }
        else
        {
            designedByFreepik.setVisibility(View.GONE);
        }
    }


}

