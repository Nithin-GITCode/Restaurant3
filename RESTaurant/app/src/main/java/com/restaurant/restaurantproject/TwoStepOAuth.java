package com.restaurant.restaurantproject;

/**
 * Created by baiyu Yang on 9/6/16.
 */



import android.support.v4.media.session.MediaSessionCompat;

import org.scribe.builder.api.DefaultApi10a;
import org.scribe.model.Token;

/**
 * Generic service provider for two-step OAuth10a.
 */
public class TwoStepOAuth extends DefaultApi10a {

    @Override
    public String getAccessTokenEndpoint() { return null; }

    @Override
    public String getAuthorizationUrl(Token unused) {
        return null;
    }

    @Override
    public String getRequestTokenEndpoint() {
        return null;
    }
}


