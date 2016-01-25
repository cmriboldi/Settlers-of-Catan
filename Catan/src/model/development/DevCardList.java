package model.development;

import shared.definitions.DevCardType;
import shared.exceptions.development.NotEnoughDevCardsException;

/**
 * The DevCardList in an object that keeps track of how many of each development cards it contains.
 * 
 * @author Christian Riboldi
 * @author Clayton Condie
 * @author Jacob Brewer
 * @author Joshua Powers
 * @author Joshua Van Steeter
 * @version 1.0 Build Jan, 2016.
 */
public class DevCardList
{

	private int monopoly;
	private int monument;
	private int roadBuilder;
	private int soldier;
	private int yearOfPlenty;

	public DevCardList()
	{

	}

	/**
	 * Adds a development card of the given type to the DevCardList.
	 * 
	 * @param devCard A DevCardType specifying the card to add.
	 */
	public void addDevCard(DevCardType devCard)
	{

	}

	/**
	 * Removed a development card of the given type from the DevCardList.
	 * 
	 * @param devCard A DevCardType specifying the card to remove.
	 */
	public void removeDevCard(DevCardType devCard) throws NotEnoughDevCardsException
	{

	}

	public int getMonopolyCount()
	{
		return monopoly;
	}

	public int getMonumentCount()
	{
		return monument;
	}

	public int getRoadBuilderCount()
	{
		return roadBuilder;
	}

	public int getSoldierCount()
	{
		return soldier;
	}

	public int getYearOfPlentyCount()
	{
		return yearOfPlenty;
	}
	
	
}
