// automatically generated by the FlatBuffers compiler, do not modify

package battlecode.schema;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
/**
 * Profiler tables
 * These tables are set-up so that they match closely with speedscope's file format documented at
 * https://github.com/jlfwong/speedscope/wiki/Importing-from-custom-sources.
 * The client uses speedscope to show the recorded data in an interactive interface.
 * A single event in a profile. Represents either an open event (meaning a
 * method has been entered) or a close event (meaning the method was exited).
 */
public final class ProfilerEvent extends Table {
  public static ProfilerEvent getRootAsProfilerEvent(ByteBuffer _bb) { return getRootAsProfilerEvent(_bb, new ProfilerEvent()); }
  public static ProfilerEvent getRootAsProfilerEvent(ByteBuffer _bb, ProfilerEvent obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__init(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public ProfilerEvent __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; return this; }

  /**
   * Whether this is an open event (true) or a close event (false).
   */
  public boolean isOpen() { int o = __offset(4); return o != 0 ? 0!=bb.get(o + bb_pos) : false; }
  /**
   * The bytecode counter at the time the event occurred.
   */
  public int at() { int o = __offset(6); return o != 0 ? bb.getInt(o + bb_pos) : 0; }
  /**
   * The index of the method name in the ProfilerFile.frames array.
   */
  public int frame() { int o = __offset(8); return o != 0 ? bb.getInt(o + bb_pos) : 0; }

  public static int createProfilerEvent(FlatBufferBuilder builder,
      boolean isOpen,
      int at,
      int frame) {
    builder.startObject(3);
    ProfilerEvent.addFrame(builder, frame);
    ProfilerEvent.addAt(builder, at);
    ProfilerEvent.addIsOpen(builder, isOpen);
    return ProfilerEvent.endProfilerEvent(builder);
  }

  public static void startProfilerEvent(FlatBufferBuilder builder) { builder.startObject(3); }
  public static void addIsOpen(FlatBufferBuilder builder, boolean isOpen) { builder.addBoolean(0, isOpen, false); }
  public static void addAt(FlatBufferBuilder builder, int at) { builder.addInt(1, at, 0); }
  public static void addFrame(FlatBufferBuilder builder, int frame) { builder.addInt(2, frame, 0); }
  public static int endProfilerEvent(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
}

