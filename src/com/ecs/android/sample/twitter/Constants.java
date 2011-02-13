package com.ecs.android.sample.twitter;

public class Constants {

	public static final String CONSUMER_KEY = "<FILL IN YOUR CONSUMER KEY FROM TWITTER HERE>";
	public static final String CONSUMER_SECRET= "<FILL IN YOUR CONSUMER SECRET FROM TWITTER HERE>";
	
	public static final String REQUEST_URL = "http://api.twitter.com/oauth/request_token";
	public static final String ACCESS_URL = "http://api.twitter.com/oauth/access_token";
	public static final String AUTHORIZE_URL = "http://api.twitter.com/oauth/authorize";
	
	public static final String	OAUTH_CALLBACK_SCHEME	= "x-oauthflow-twitter";
	public static final String	OAUTH_CALLBACK_HOST		= "callback";
	public static final String	OAUTH_CALLBACK_URL		= OAUTH_CALLBACK_SCHEME + "://" + OAUTH_CALLBACK_HOST;

}

