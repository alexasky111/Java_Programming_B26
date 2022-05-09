package day55_polymorphism.shopping;

import day54_abstraction.homework.AllowUsersToSell;
//WE ARE PASSING THE M-THODS FROM THE SHIPPING AND ALLOWUSERTOSELL interface to the ConsumerApp interface

//going from interface to interface is inheritance so we use extends. Remember these are interface, so they don't follow th same rules as classes. we can extend multiple interfaces
public interface ConsumerApp extends Shipping, AllowUsersToSell {}
//1st ex is if we implemented both of the original interface to a class directly
abstract class TestA implements Shipping, AllowUsersToSell {}

//instead implement ONE after IT inherited BOTH
abstract class TestB implements ConsumerApp{}