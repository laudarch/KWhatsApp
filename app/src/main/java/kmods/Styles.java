package kmods;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

public class Styles {
    public static Drawable BubbleStyle(Context ctx,final int id){
        try {
            String name = ctx.getSharedPreferences("com.whatsapp_preferences", 0).getString("bubble_s", "stock");
            int n = 0;
            int n1 = getHexID("balloon_outgoing_normal", "drawable");
            int n2 = getHexID("balloon_outgoing_normal_ext", "drawable");
            int n3 = getHexID("balloon_incoming_normal", "drawable");
            int n4 = getHexID("balloon_incoming_normal_ext", "drawable");
            if (id == n1) {
                n = 1;
            } else if (id == n2) {
                n = 2;
            } else if (id == n3) {
                n = 3;
            } else if (id == n4) {
                n = 4;
            } else {
                return ctx.getResources().getDrawable(id);
            }
            if (!name.equals("stock")) {
                n1 = getHexID(name + "_balloon_outgoing_normal", "drawable");
                n2 = getHexID(name + "_balloon_outgoing_normal_ext", "drawable");
                n3 = getHexID(name + "_balloon_incoming_normal", "drawable");
                n4 = getHexID(name + "_balloon_incoming_normal_ext", "drawable");
            }
            switch (n) {
                case 1: {
                    return ctx.getResources().getDrawable(n1);
                }
                case 2: {
                    return ctx.getResources().getDrawable(n2);
                }
                case 3: {
                    return ctx.getResources().getDrawable(n3);
                }
                default: {
                    return ctx.getResources().getDrawable(n4);
                }
            }
        } catch (Exception e){
           return ctx.getResources().getDrawable(id);
        }
    }
    //a(I)I
    public static int TickStyle(final int id){
        try {
            String name = Utils.ctx.getSharedPreferences("com.whatsapp_preferences", 0).getString("tick_s", "stock");
            int n = 0;
            int n1 = getHexID("message_unsent", "drawable");
            int n2 = getHexID("message_got_read_receipt_from_target", "drawable");
            int n3 = getHexID("message_got_receipt_from_target", "drawable");
            int n4 = getHexID("message_got_receipt_from_server", "drawable");
            if (id == n1) {
                n = 1;
            } else if (id == n2) {
                n = 2;
            } else if (id == n3) {
                n = 3;
            } else if (id == n4) {
                n = 4;
            } else {
                return id;
            }
            if (!name.equals("stock")) {
                n1 = getHexID(name + "_message_unsent", "drawable");
                n2 = getHexID(name + "_message_got_read_receipt_from_target", "drawable");
                n3 = getHexID(name + "_message_got_receipt_from_target", "drawable");
                n4 = getHexID(name + "_message_got_receipt_from_server", "drawable");
            }
            switch (n) {
                case 1: {
                    return n1;
                }
                case 2: {
                    return n2;
                }
                case 3: {
                    return n3;
                }
                default: {
                    return n4;
                }
            }
        } catch (Exception e){
            return id;
        }
    }
    //a(I)I
    public static int TickStyle2(final int id){//ConversationRowVideo,ConversationRowImage
        try {
            final String name = Utils.ctx.getSharedPreferences("com.whatsapp_preferences", 0).getString("tick_s", "stock");
            int n = 0;
            int n1 = getHexID("message_unsent_onmedia", "drawable");
            int n2 = getHexID("message_got_read_receipt_from_target_onmedia", "drawable");
            int n3 = getHexID("message_got_receipt_from_target_onmedia", "drawable");
            int n4 = getHexID("message_got_receipt_from_server_onmedia", "drawable");
            if (id == n1) {
                n = 1;
            } else if (id == n2) {
                n = 2;
            } else if (id == n3) {
                n = 3;
            } else if (id == n4) {
                n = 4;
            } else {
                return id;
            }
            if (!name.equals("stock")) {
                n1 = getHexID(name + "_message_unsent", "drawable");
                n2 = getHexID(name + "_message_got_read_receipt_from_target", "drawable");
                n3 = getHexID(name + "_message_got_receipt_from_target", "drawable");
                n4 = getHexID(name + "_message_got_receipt_from_server", "drawable");
            }
            if(name.equals("bpg") || name.equals("hike") || name.equals("ios") || name.equals("letter") || name.equals("newwaca") || name.equals("nh") || name.equals("oldwaca")){
                n1 = getHexID(name + "_message_unsent_onmedia", "drawable");
                n2 = getHexID(name + "_message_got_read_receipt_from_target_onmedia", "drawable");
                n3 = getHexID(name + "_message_got_receipt_from_target_onmedia", "drawable");
                n4 = getHexID(name + "_message_got_receipt_from_server_onmedia", "drawable");
            }
            switch (n) {
                case 1: {
                    return n1;
                }
                case 2: {
                    return n2;
                }
                case 3: {
                    return n3;
                }
                default: {
                    return n4;
                }
            }
        } catch (Exception e){
            return id;
        }
    }
    public static int TickStyle3(final int id){
        try {
            String name = Utils.ctx.getSharedPreferences("com.whatsapp_preferences", 0).getString("tick_s", "stock");
            int n = 0;
            int n1 = getHexID("msg_status_gray_waiting", "drawable");
            int n2 = getHexID("msg_status_server_receive", "drawable");
            int n3 = getHexID("msg_status_client_received", "drawable");
            int n4 = getHexID("msg_status_client_read", "drawable");
            if (id == n1) {
                n = 1;
            } else if (id == n2) {
                n = 2;
            } else if (id == n3) {
                n = 3;
            } else if (id == n4) {
                n = 4;
            } else {
                return id;
            }
            if (!name.equals("stock")) {
                n1 = getHexID(name + "_message_unsent", "drawable");
                n2 = getHexID(name + "_message_got_receipt_from_server", "drawable");
                n3 = getHexID(name + "_message_got_receipt_from_target", "drawable");
                n4 = getHexID(name + "_message_got_read_receipt_from_target", "drawable");
            }
            switch (n) {
                case 1: {
                    return n1;
                }
                case 2: {
                    return n2;
                }
                case 3: {
                    return n3;
                }
                default: {
                    return n4;
                }
            }
        } catch (Exception e){
            return id;
        }
    }
    private static int getHexID(String name, String type) {
        return Utils.ctx.getResources().getIdentifier(name, type, Utils.ctx.getPackageName());
    }
}