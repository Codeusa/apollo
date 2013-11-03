package org.apollo.net.release.r317;

import org.apollo.game.event.impl.FourthItemOptionEvent;
import org.apollo.net.codec.game.DataOrder;
import org.apollo.net.codec.game.DataTransformation;
import org.apollo.net.codec.game.DataType;
import org.apollo.net.codec.game.GamePacket;
import org.apollo.net.codec.game.GamePacketReader;
import org.apollo.net.release.EventDecoder;

/**
 * An {@link EventDecoder} for the {@link FourthItemOptionEvent}.
 * 
 * @author Chris Fletcher
 */
final class FourthItemOptionEventDecoder extends EventDecoder<FourthItemOptionEvent> {

	@Override
	public FourthItemOptionEvent decode(GamePacket packet) {
		GamePacketReader reader = new GamePacketReader(packet);

		int interfaceId = (int) reader.getSigned(DataType.SHORT, DataOrder.LITTLE, DataTransformation.ADD);
		int slot = (int) reader.getSigned(DataType.SHORT, DataOrder.LITTLE);
		int id = (int) reader.getUnsigned(DataType.SHORT, DataTransformation.ADD);

		return new FourthItemOptionEvent(interfaceId, id, slot);
	}

}
