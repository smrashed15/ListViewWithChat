package com.e_vision.isl.listviewlikechat;

import android.util.Log;
import android.widget.Toast;

public class ChatMessage {

    private String content;
    public boolean isMine;

    public ChatMessage(String content, boolean isMine) {
        this.content = content;
        this.isMine = isMine;
       // Toast.makeText(this.getContent(),"Value is: "+isMine,Toast.LENGTH_LONG).show();
        Log.d("Lo","Value is: "+isMine);
    }

    public String getContent() {
        return content;
    }

    public boolean isMine() {
        return isMine;
    }
}
