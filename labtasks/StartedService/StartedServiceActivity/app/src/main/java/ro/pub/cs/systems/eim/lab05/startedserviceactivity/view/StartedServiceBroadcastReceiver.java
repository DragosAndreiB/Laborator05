package ro.pub.cs.systems.eim.lab05.startedserviceactivity.view;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.TextView;

import ro.pub.cs.systems.eim.lab05.startedserviceactivity.general.Constants;

public class StartedServiceBroadcastReceiver extends BroadcastReceiver {

    private TextView messageTextView;

    // TODO: exercise 9 - default constructor

    public StartedServiceBroadcastReceiver(TextView messageTextView) {
        this.messageTextView = messageTextView;
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        String data = null;
        if (Constants.ACTION_STRING.equals(action)) {
            data = intent.getStringExtra(Constants.DATA);
        }
        if (messageTextView != null) {
            messageTextView.setText(messageTextView.getText().toString() + "\n" + data);
        }
    }
}