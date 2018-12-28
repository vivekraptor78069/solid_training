public class allocation implements ResourceAllocatorTime{
	public void time_slot()
	{
		resourceId = findFreeTimeSlot();
        markTimeSlotBusy(resourceId);
	}
	public void space_slot(){
		resourceId = findFreeSpaceSlot();
		markSpaceSlotBusy(resourceId);
	}
	
	private void markTimeSlotBusy(int resourceId)
    {
    }
}

