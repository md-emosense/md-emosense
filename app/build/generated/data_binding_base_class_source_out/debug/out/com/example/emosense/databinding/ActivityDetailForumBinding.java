// Generated by view binder compiler. Do not edit!
package com.example.emosense.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.emosense.R;
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityDetailForumBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final CardView card;

  @NonNull
  public final ImageView imageView2;

  @NonNull
  public final CircleImageView ivProfile;

  @NonNull
  public final ConstraintLayout main;

  @NonNull
  public final RecyclerView rvReplies;

  @NonNull
  public final TextView textView3;

  @NonNull
  public final TextView tvDesc;

  @NonNull
  public final TextView tvName;

  @NonNull
  public final TextView tvNumofComments;

  @NonNull
  public final TextView tvTime;

  @NonNull
  public final TextView tvTitle;

  private ActivityDetailForumBinding(@NonNull ConstraintLayout rootView, @NonNull CardView card,
      @NonNull ImageView imageView2, @NonNull CircleImageView ivProfile,
      @NonNull ConstraintLayout main, @NonNull RecyclerView rvReplies, @NonNull TextView textView3,
      @NonNull TextView tvDesc, @NonNull TextView tvName, @NonNull TextView tvNumofComments,
      @NonNull TextView tvTime, @NonNull TextView tvTitle) {
    this.rootView = rootView;
    this.card = card;
    this.imageView2 = imageView2;
    this.ivProfile = ivProfile;
    this.main = main;
    this.rvReplies = rvReplies;
    this.textView3 = textView3;
    this.tvDesc = tvDesc;
    this.tvName = tvName;
    this.tvNumofComments = tvNumofComments;
    this.tvTime = tvTime;
    this.tvTitle = tvTitle;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityDetailForumBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityDetailForumBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_detail_forum, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityDetailForumBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.card;
      CardView card = ViewBindings.findChildViewById(rootView, id);
      if (card == null) {
        break missingId;
      }

      id = R.id.imageView2;
      ImageView imageView2 = ViewBindings.findChildViewById(rootView, id);
      if (imageView2 == null) {
        break missingId;
      }

      id = R.id.ivProfile;
      CircleImageView ivProfile = ViewBindings.findChildViewById(rootView, id);
      if (ivProfile == null) {
        break missingId;
      }

      ConstraintLayout main = (ConstraintLayout) rootView;

      id = R.id.rvReplies;
      RecyclerView rvReplies = ViewBindings.findChildViewById(rootView, id);
      if (rvReplies == null) {
        break missingId;
      }

      id = R.id.textView3;
      TextView textView3 = ViewBindings.findChildViewById(rootView, id);
      if (textView3 == null) {
        break missingId;
      }

      id = R.id.tvDesc;
      TextView tvDesc = ViewBindings.findChildViewById(rootView, id);
      if (tvDesc == null) {
        break missingId;
      }

      id = R.id.tvName;
      TextView tvName = ViewBindings.findChildViewById(rootView, id);
      if (tvName == null) {
        break missingId;
      }

      id = R.id.tvNumofComments;
      TextView tvNumofComments = ViewBindings.findChildViewById(rootView, id);
      if (tvNumofComments == null) {
        break missingId;
      }

      id = R.id.tvTime;
      TextView tvTime = ViewBindings.findChildViewById(rootView, id);
      if (tvTime == null) {
        break missingId;
      }

      id = R.id.tvTitle;
      TextView tvTitle = ViewBindings.findChildViewById(rootView, id);
      if (tvTitle == null) {
        break missingId;
      }

      return new ActivityDetailForumBinding((ConstraintLayout) rootView, card, imageView2,
          ivProfile, main, rvReplies, textView3, tvDesc, tvName, tvNumofComments, tvTime, tvTitle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
