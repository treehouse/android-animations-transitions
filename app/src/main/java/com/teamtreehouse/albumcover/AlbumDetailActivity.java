package com.teamtreehouse.albumcover;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;

import butterknife.ButterKnife;
import butterknife.Bind;
import butterknife.OnClick;


public class AlbumDetailActivity extends Activity {

    public static final String EXTRA_ALBUM_ART_RESID = "EXTRA_ALBUM_ART_RESID";

    @Bind(R.id.album_art) ImageView albumArtView;
    @Bind(R.id.fab) ImageButton fab;
    @Bind(R.id.cyan_panel) ViewGroup cyanPanel;
    @Bind(R.id.white_panel) ViewGroup whitePanel;
    @Bind(R.id.detail_container) ViewGroup detailContainer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_album_detail);
        ButterKnife.bind(this);
        populate();
    }

    @OnClick(R.id.album_art)
    public void onAlbumArtClick(View view) {

    }

    private void populate() {
        int albumArtResId = getIntent().getIntExtra(EXTRA_ALBUM_ART_RESID, R.drawable.christina);
        albumArtView.setImageResource(albumArtResId);
    }
}
