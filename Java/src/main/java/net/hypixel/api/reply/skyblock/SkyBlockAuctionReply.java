package net.hypixel.api.reply.skyblock;

import com.google.gson.JsonArray;

import net.hypixel.api.reply.AbstractReply;

public class SkyBlockAuctionReply extends AbstractReply {
    private JsonArray auctions;

    public JsonArray getAuctions() {
        if (auctions == null || auctions.isJsonNull()) {
            return null;
        } else {
            return auctions.getAsJsonArray();
        }
    }

    public String toString() {
        return "SkyBlockAuctionReply{" +
               "auctions = " + auctions +
               "} " + super.toString();
    }
}
