package edu.rosehulman.sunz1.rosechat.utils;

import edu.rosehulman.sunz1.rosechat.activities.MainActivity;

/**
 * Created by sun on 7/21/17.
 *
 * Used for storing all constants that we will need in this project
 */

public class Constants {

    // For the Chat Feature
    public static final String ARG_USERS = "users";
    public static final String ARG_RECEIVER = "receiver";
    public static final String ARG_CHATROOM_NAME = "chatroom_name";
    public static final String ARG_RECEIVER_UID = "receiver_uid";
    public static final String ARG_FIREBASE_TOKEN = "firebase_token";
    public static final String ARG_MESSAGE = "message";
    public static final String ARG_CHATROOM_ID = "chatroom_id";
    public static final String ARG_SENDER_UID = "sender_uid";

    // For the Profile Feature
    public static final String PROF_NICK_NAME = "prof_nick_name";
    public static final String PROF_EMAIL = "prof_email";
    public static final String PROF_PHONE = "prof_phone";
    public static final String PROF_PROFILE_PIC_URL = "prof_url";
    public static final String PROF_NEW_UID = "prof_new_uid";

    // For the FireBase
    public static final String PATH_CHAT = "chats";
    public static final String PATH_CONTACT = "contacts";
    public static final String PATH_MESSAGE = "messages";
    public static final String PATH_PROFILE_PIC = "profile_pics";
    public static final String PATH_INVITATION = "invitations";

    // For the SharedPreferences
    public static final String PREFS = "PREFS";
    public static final String UID_KEY = "UID_KEY";
    public static final String DB_CON_KEY = "DB_CON_KEY";

    // For TAGs
    public static final String TAG = MainActivity.class.getName();
    public static final String TAG_CHAT_COMMUNICATOR = "chatsComm_test";
    public static final String TAG_CHAT = "chat_test";
    public static final String TAG_PROFILE = "profile_test";
    public static final String TAG_MESSAGE  = "message_test";
    public static final String TAG_CHAT_ADAPTER = "chatAdapter_test";
    public static final String TAG_LOGIN = "login_test";
    public static final String TAG_CONNECTION = "connection_test";
    public static final String TAG_SETTING = "setting_test";

    // For Database
    public static final String DB_ServerName = "golem.csse.rose-hulman.edu";
    public static final String DB_DatabaseName = "RoseChat";
    public static final String DB_ServerUsername = "RCClient";
    public static final String DB_ServerPassword = "RCClient123";

    //Font
    public static double FONT_SIZE_FACTOR = 1;
    public static double FONT_FAMILY = 0; //0: default; 1: monospace
    public static float MESSAGE_FONT_SIZE = 1;
    public static int MEESSAGE_FONT_FAMILY = 0;
}