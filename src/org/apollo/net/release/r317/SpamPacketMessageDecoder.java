package org.apollo.net.release.r317;

import org.apollo.game.message.impl.SpamPacketMessage;
import org.apollo.net.codec.game.GamePacket;
import org.apollo.net.release.MessageDecoder;

/**
 * A {@link MessageDecoder} for the {@link SpamPacketMessage}.
 * 
 * @author Major
 */
public final class SpamPacketMessageDecoder extends MessageDecoder<SpamPacketMessage> {

	@Override
	public SpamPacketMessage decode(GamePacket packet) {
		return new SpamPacketMessage(packet.getPayload().array());
	}

}