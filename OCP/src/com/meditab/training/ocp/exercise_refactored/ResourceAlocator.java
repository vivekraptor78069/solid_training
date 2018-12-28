public interface ResourceAllocatorTime
{
	public void time_slot();
	private void markSpaceSlotBusy(int resourceId);
	private void markTimeSlotBusy(int resourceId);
	private int findFreeTimeSlot();
}

public interface ResourceAllocatorSpace
{
	public void space_slot();
	private void markSpaceSlotFree(int resourceId);
    private void markTimeSlotFree(int resourceId);
	  private int findFreeSpaceSlot();
}
	