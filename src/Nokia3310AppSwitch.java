import java.util.Scanner;

public class Nokia3310AppSwitch{
	public static void main(String[] args){
		Scanner collector = new Scanner(System.in);
		int input1 = 0;
		while (input1 != 14){
		System.out.print("\nMAIN MENU\nEnter \n1 => Phone Book\n2 => Messages\n3 => Chat\n4 => Call Register\n5 => Tones\n6 => Settings\n7 => Call divert\n8 => Games\n9 => Calculator\n10 => Reminders\n11 => Clock\n12 => Profiles\n13 => SIM services\n14 => Exit\n\nEnter: ");
		input1 = collector.nextInt();
		switch(input1){
			case 1:
			int phonebookInput = 0;
			while (phonebookInput != 11){
			System.out.print("PHONE BOOK MENU\nEnter\n1 => Search\n2 => Service Nos\n3 => Add Name\n4 => Erase\n5 => Edit\n6 => Assign tone\n7 => Send B' Card\n8 => Options\n9 => Speed Dails\n10 => Voice Tag\n11 => Exit\n\nEnter: ");
			phonebookInput = collector.nextInt();
			switch(phonebookInput){
				case 1:
					int inputSearch = 0;
					while (inputSearch != 1){
					System.out.print("\"Search\"\n1 => Exit\n");
					System.out.print("Enter: ");
					inputSearch = collector.nextInt();
					}
					break;
				case 2:
					int inputService = 0;
					while (inputService != 1){
					System.out.print("Service Number 22345678789\n1 => Exit\n");
					System.out.print("Enter: ");
					inputService = collector.nextInt();
					}
					break;
				case 3:
					System.out.print("Enter a name: ");
					String input3 = collector.next();
					System.out.print("\nYou entered " + input3 + "\n" + "1 => Exit\n");
					int inputAddName = 0;
					while (inputAddName != 1){
					System.out.print("Enter: ");
					inputAddName = collector.nextInt();
					}
					break;
				case 4:
					System.out.print("Erase\n1 => Exit\n");
					int inputErase = 0;
					while (inputErase != 1){
					System.out.print("Enter: ");
					inputErase = collector.nextInt();
					}
					
					break;
				case 5:
					System.out.print("Edit\n1 => Exit\n");
					int inputEdit = 0;
					while (inputEdit != 1){
					System.out.print("Enter: ");
					inputEdit = collector.nextInt();
					}
					break;
				case 6:
					System.out.print("Assign tones\n1 => Exit\n");
					int inputAssign = 0;
					while (inputAssign != 1){
					System.out.print("Enter: ");
					inputAssign = collector.nextInt();
					}
					break;
				case 7:
					System.out.print("Send B' card\n1 => Exit\n");
					int inputSend = 0;
					while (inputSend != 1){
					System.out.print("Enter: ");
					inputSend = collector.nextInt();
					}
					break;
				case 8:
					int input4 = 0;
					while (input4 != 3){
					System.out.print("OPTION MENU\nEnter \n1 => Type of view\n2 => Memory Status\n3 => Exit\n");
					input4 = collector.nextInt();
					switch(input4){
						case 1:
							System.out.print("You entered TYPE OF VIEW\n1 => Exit\n");
							int inputType = 0;
							while (inputType != 1){
							System.out.print("Enter: ");
							inputType = collector.nextInt();
							}
							break;
						case 2: 
							System.out.print("12/30 Memory used\n1 => Exit\n");
							int inputMemory = 0;
							while (inputMemory != 1){
							System.out.print("Enter: ");
							inputMemory = collector.nextInt();
							}
							break;
					}
					}
					break;
				case 9:
					System.out.print("Your most dailed number shows here\n1 => Exit\n");
					int inputDial = 0;
					while (inputDial != 1){
					System.out.print("Enter: ");
					inputDial = collector.nextInt();
					}
					break;
				case 10:
					System.out.print("Your Voice Tag\n1 => Exit\n");
					int inputVoice = 0;
					while (inputVoice != 1){
					System.out.print("Enter: ");
					inputVoice = collector.nextInt();
					}
					break;
			}
			}
			break;
			case 2:
			int input22 = 0;
			while (input22 != 11){
			System.out.print("Enter\nMESSAGE MENU\n1 => Write Messages\n2 => Inbox\n3 => Outbox\n4 => Picture messages\n5 => Templates\n6 => Smileys\n7 => Messages settings\n8 => Info service\n9 => Voice mailbox number\n10 => Service command editor\n11 => Exit to main menu\n\nEnter: ");
			input22 = collector.nextInt();
				switch(input22){
				case 1:
					System.out.print("Write Messages\n1 => Exit\n");
					int inputMessage = 0;
					while (inputMessage != 1){
					System.out.print("Enter: ");
					inputMessage = collector.nextInt();
					}
					break;
				case 2:
					System.out.print("Inbox\n\nMessage 1\nMessage 2\n1 => Exit\n");
					int inputInbox = 0;
					while (inputInbox != 1){
					System.out.print("Enter: ");
					inputInbox = collector.nextInt();
					}
					break;
				case 3:
					System.out.print("Outbox\nDraft\n1 => Exit\n");
					int inputOutbox = 0;
					while (inputOutbox != 1){
					System.out.print("Enter: ");
					inputOutbox = collector.nextInt();
					}
					break;
				case 4:
					System.out.print("Picture Message\n1 => Exit\n");
					int inputPicture = 0;
					while (inputPicture != 1){
					System.out.print("Enter: ");
					inputPicture = collector.nextInt();
					}
					break;
				case 5:
					System.out.print("Templates\n1 => Exit\n");
					int inputTemplate = 0;
					while (inputTemplate != 1){
					System.out.print("Enter: ");
					inputTemplate = collector.nextInt();
					}
					break;
				case 6:
					System.out.print(":) :) :) :]\n1 => Exit\n");
					int inputSmiley = 0;
					while (inputSmiley != 1){
					System.out.print("Enter: ");
					inputSmiley = collector.nextInt();
					}
					break;
				case 7:
					int input3 = 0;
					while (input3 != 3){
					System.out.print("1 => Set\n2 => Common\n3 => Exit\n\nEnter: ");
					input3 = collector.nextInt();
						switch(input3){
						case 1:
							int inputSet = 0;
							while (inputSet != 4){
							System.out.print("Enter\nSET MENU\n1 => Message center number\n2 => Messages sent as\n3 => Message validity\n4 => Exit to menu\n\n");
							System.out.print("Enter: ");
							inputSet = collector.nextInt();
							switch(inputSet){
								case 1:
									int inputCenter = 0;
									while (inputCenter != 1){
									System.out.print("17884748754\n1 => Exit\n");
									System.out.print("Enter: ");
									inputCenter = collector.nextInt();
									}
									break;
								case 2:
									int inputSender = 0;
									while (inputSender != 1){
									System.out.print("Your name\n1 => Exit\n");
									System.out.print("Enter: ");
									inputSender = collector.nextInt();
									}
									break;
								case 3:
									int inputValidity = 0;
									while (inputValidity != 1){
									System.out.print("Message validity\n1 => Exit\n");
									System.out.print("Enter: ");
									inputValidity = collector.nextInt();
									}
									break;
							
							}
						
					
						}
						break;
						case 2:
							int inputCommon = 0;
							while (inputCommon != 4){
							System.out.print("Enter\nCOMMON MENU\n1. Delivery reports\n2. Reply via same centre\n3. Character support\n4 => Exit to menu\n\n");
							System.out.print("Enter: ");
							inputCommon = collector.nextInt();
							switch(inputCommon){
							case 1:
								int inputReport = 0;
								while (inputReport != 1){
								System.out.print("Yes//no\n1 => Exit\n");
								System.out.print("Enter: ");
								inputReport = collector.nextInt();
								}
								break;
							case 2:
								int inputReply = 0;
								while (inputReply != 1){
								System.out.print("Reply via same centre\n1 => Exit\n");
								System.out.print("Enter: ");
								inputReply = collector.nextInt();
								}
								break;
							case 3:
								int inputCharacter = 0;
								while (inputCharacter != 1){
								System.out.print("Character support\n1 => Exit\n");
								System.out.print("Enter: ");
								inputCharacter = collector.nextInt();
								}
								break;
							
							}
							}
							}
						break;
					
			
				}
				}
			}
			break;
			case 3: 
				int inputChat = 0;
				while (inputChat != 1){
				System.out.print("Chat\n1 => Exit to menu\n\nEnter: ");
				inputChat = collector.nextInt();
				}
				break;
			case 4: 
				int inputCallRegister = 0;
				while (inputCallRegister != 9){
				System.out.print("Enter\nCALL REGISTER MENU\n1 => Missed calls\n2 => Received calls\n3 => Dialled calls\n4 => Erase recent calls lists\n5 => Show call duration\n6 => Show call costs\n7 => Call cost settings\n8 => Prepaid credit\n9 => Exit to menu\n");
				System.out.print("Enter: ");
				inputCallRegister = collector.nextInt();
				switch(inputCallRegister){
					case 1: 
						int inputMissedCalls = 0;
						while (inputMissedCalls != 1){
						System.out.print("Missed Calls list\n1 => Exit");
						System.out.print("Enter: ");
						inputMissedCalls = collector.nextInt();
						}
						break;
					case 2: 
						int inputReceivedCalls = 0;
						while (inputReceivedCalls != 1){
						System.out.print("Received Calls list\n1 => Exit");
						System.out.print("Enter: ");
						inputReceivedCalls = collector.nextInt();
						}
						break;
					case 3: 
						int inputDialedCalls = 0;
						while (inputDialedCalls != 1){
						System.out.print("Dialed Calls list\n1 => Exit");
						System.out.print("Enter: ");
						inputDialedCalls = collector.nextInt();
						}
						break;
					case 4: 
						int inputErase = 0;
						while (inputErase != 1){
						System.out.print("Dialed Calls list\n1 => Exit");
						System.out.print("Enter: ");
						inputErase = collector.nextInt();
						}
						break;
					case 5:
						int inputDuration = 0;
						while (inputDuration != 6){
						System.out.print("Enter\nSHOW CALL DURATION MENU\n1 => Last call duration\n2 => All calls' duration\n3 => Received calls' duration\n4 => Dialed calls' duration\n5 => Clear timers\n6 => Exit to menu\n\n");
						System.out.print("Enter: ");
						inputDuration = collector.nextInt();
							switch (inputDuration){
								case 1: 
									int inputLastCalls = 0;
									while (inputLastCalls != 1){
									System.out.print("Last call duration\n1 => Exit");
									System.out.print("Enter: ");
									inputLastCalls = collector.nextInt();
									}
									break;
								case 2: 
									int inputAllCalls = 0;
									while (inputAllCalls != 1){
									System.out.print("All calls duration\n1 => Exit");
									System.out.print("Enter: ");
									inputAllCalls = collector.nextInt();
									}
									break;
								case 3: 
									int inputCalls1 = 0;
									while (inputCalls1 != 1){
									System.out.print("Received calls duration\n1 => Exit");
									System.out.print("Enter: ");
									inputCalls1 = collector.nextInt();
									}
									break;
								case 4: 
									int inputCalls2 = 0;
									while (inputCalls2 != 1){
									System.out.print("Dialed calls duration\n1 => Exit");
									System.out.print("Enter: ");
									inputCalls2 = collector.nextInt();
									}
									break;
								case 5: 
									int inputClearCalls = 0;
									while (inputClearCalls != 1){
									System.out.print("Clear Timers\n1 => Exit");
									System.out.print("Enter: ");
									inputClearCalls = collector.nextInt();
									}
									break;
						}
							}
						break;
					case 6:
						int inputCallCost = 0;
						while (inputCallCost != 4){
						System.out.print("Enter\nCALL COST MENU\n1 => Last call cost\n2 => All costs' cost\n3 => Clear counter\n4 => Exit to menu\n\n");
						System.out.print("Enter: ");
						inputCallCost = collector.nextInt();
							switch(inputCallCost){
								case 1:
									int inputLastCallsCost = 0;
									while (inputLastCallsCost != 1){
									System.out.print("Last call cost\n1 => Exit");
									System.out.print("Enter: ");
									inputLastCallsCost = collector.nextInt();
									}
									break;
								case 2:
									int inputAllCallsCost = 0;
									while (inputAllCallsCost != 1){
									System.out.print("All calls cost\n1 => Exit");
									System.out.print("Enter: ");
									inputAllCallsCost = collector.nextInt();
									}
									break;
								case 3: 
									int inputClearCounter = 0;
									while (inputClearCounter != 1){
									System.out.print("Clear Counter\n1 => Exit");
									System.out.print("Enter: ");
									inputClearCounter = collector.nextInt();
									}
									break;
							
							}
						}
						break;
					case 7:
						int inputCallCostSettings = 0;
						while (inputCallCostSettings != 3){
						System.out.print("Enter\nCALL COST SETTINGS MENU\n1 => Call cost limit\n2 => Show cost in\n3 => Exit to menu\n\n");
						System.out.print("Enter: ");
						inputCallCostSettings = collector.nextInt();
							switch(inputCallCostSettings){
								case 1:
									int inputCallCostLimit = 0;
									while (inputCallCostLimit != 1){
									System.out.print("Call cost limit\n1 => Exit");
									System.out.print("Enter: ");
									inputCallCostLimit = collector.nextInt();
									}
									break;
								case 2:
									int inputShowCost = 0;
									while (inputShowCost != 1){
									System.out.print("Show cost in\n1 => Exit");
									System.out.print("Enter: ");
									inputShowCost = collector.nextInt();
									}
									break;
							
							}
						}
						break;
				}
				}
			break;
			case 5:
				int inputTones = 0;
				while (inputTones != 10){
				System.out.print("Enter\nTONES MENU\n1 => Ringing tone\n2 => Ringing volume\n3 => Incoming call alert\n4 => Composer\n5 => Message alert tone\n6 => Keypad tones\n7 => Warning and games tone\n8 => Vibrating alert\n9 => Screen saver\n10 => Exit to menu\n\n");
				System.out.print("Enter: ");
				inputTones = collector.nextInt();
					switch(inputTones){
						case 1: 
							int inputRingingTone = 0;
							while (inputRingingTone != 1){
							System.out.print("Ringing tone\n1 => Exit");
							System.out.print("\nEnter: ");
							inputRingingTone = collector.nextInt();
							}
							break;
						case 2: 
							int inputRingingVolume = 0;
							while (inputRingingVolume != 1){
							System.out.print("Ringing Volume\n1 => Exit");
							System.out.print("\nEnter: ");
							inputRingingVolume = collector.nextInt();
							}
							break;
						case 3: 
							int inputIncomingCallAlert = 0;
							while (inputIncomingCallAlert != 1){
							System.out.print("Incoming call alert\n1 => Exit");
							System.out.print("\nEnter: ");
							inputIncomingCallAlert = collector.nextInt();
							}
							break;
						case 4: 
							int inputComposer = 0;
							while (inputComposer != 1){
							System.out.print("Composer\n1 => Exit");
							System.out.print("\nEnter: ");
							inputComposer = collector.nextInt();
							}
							break;
						case 5: 
							int inputMessageAlertTone = 0;
							while (inputMessageAlertTone != 1){
							System.out.print("Message Alert Tone\n1 => Exit");
							System.out.print("\nEnter: ");
							inputMessageAlertTone = collector.nextInt();
							}
							break;
						case 6: 
							int inputKeypadTone = 0;
							while (inputKeypadTone != 1){
							System.out.print("Keypad Tone\n1 => Exit");
							System.out.print("\nEnter: ");
							inputKeypadTone = collector.nextInt();
							}
							break;
						case 7: 
							int inputGameTone = 0;
							while (inputGameTone != 1){
							System.out.print("Game Tone\n1 => Exit");
							System.out.print("\nEnter: ");
							inputGameTone = collector.nextInt();
							}
							break;
						case 8: 
							int inputVibratingAlert = 0;
							while (inputVibratingAlert != 1){
							System.out.print("Vibrating Alert\n1 => Exit");
							System.out.print("\nEnter: ");
							inputVibratingAlert = collector.nextInt();
							}
							break;
						case 9: 
							int inputScreenSaver = 0;
							while (inputScreenSaver != 1){
							System.out.print("Screen saver\n1 => Exit");
							System.out.print("\nEnter: ");
							inputScreenSaver = collector.nextInt();
							}
							break;
					}
				}
			break;
			case 6:
				int inputSettings = 0;
				while (inputSettings != 5){
				System.out.print("Enter\nSETTINGS MENU\n1 => Call settings\n2 => Phone settings\n3 => Security settings\n4 => Restore factory settings\n5 => Exit to menu\n\nEnter: ");
				inputSettings = collector.nextInt();
					switch(inputSettings){
						case 1:
							int inputCallSettings = 0;
							while (inputCallSettings != 7){
							System.out.print("Enter\nCALL SETTINGS MENU\n1 => Automatic redial\n2 => Speed dialling\n3 => Call waiting options\n4 => Own number sending\n5 => Phone line in use\n6 => Automatic answer\n7 => Exit to menu\n\n");
							System.out.print("\nEnter: ");
							inputCallSettings = collector.nextInt();
								switch(inputCallSettings){
									case 1:
										int inputAutomaticRedial = 0;
										while (inputAutomaticRedial != 1){
										System.out.print("Automatic redial\n1 => Exit");
										System.out.print("\nEnter: ");
										inputAutomaticRedial = collector.nextInt();
										}
										break;
									case 2:
										int inputSpeeDial = 0;
										while (inputSpeeDial != 1){
										System.out.print("Speed dialling\n1 => Exit");
										System.out.print("\nEnter: ");
										inputSpeeDial = collector.nextInt();
										}
										break;
									case 3:
										int inputCallWaiting = 0;
										while (inputCallWaiting != 1){
										System.out.print("Call waiting options\n1 => Exit");
										System.out.print("\nEnter: ");
										inputCallWaiting = collector.nextInt();
										}
										break;
									case 4:
										int inputOwnNumberSending = 0;
										while (inputOwnNumberSending != 1){
										System.out.print("Own number sending\n1 => Exit");
										System.out.print("\nEnter: ");
										inputOwnNumberSending = collector.nextInt();
										}
										break;
									case 5:
										int inputPhoneLine = 0;
										while (inputPhoneLine != 1){
										System.out.print("Phone line in use\n1 => Exit");
										System.out.print("\nEnter: ");
										inputPhoneLine = collector.nextInt();
										}
										break;
									case 6:
										int inputAutomaticAnswer = 0;
										while (inputAutomaticAnswer != 1){
										System.out.print("Automatic answer\n1 => Exit");
										System.out.print("\nEnter: ");
										inputAutomaticAnswer = collector.nextInt();
										}
										break;
								}
							}
							break;
						case 2:
							int inputCallSettings1 = 0;
							while (inputCallSettings1 != 7){
							System.out.print("Enter\nPHONE SETTINGS MENU\n1 => Language\n2 => Cell info display\n3 => Welcome note\n4 => Network selection\n5 => Light\n6 => Confirm SIM services actions\n7 => Exit to menu\n\n");
							System.out.print("\nEnter: ");
							inputCallSettings1 = collector.nextInt();
								switch(inputCallSettings1){
									case 1:
										int inputLanguage = 0;
										while (inputLanguage != 1){
										System.out.print("Language\nEnglish\nFrench\nSpanish\nYoruba\n1 => Exit");
										System.out.print("\nEnter: ");
										inputLanguage = collector.nextInt();
										}
										break;
									case 2:
										int inputCellInfo = 0;
										while (inputCellInfo != 1){
										System.out.print("Cell info display\n1 => Exit");
										System.out.print("\nEnter: ");
										inputCellInfo = collector.nextInt();
										}
										break;
									case 3:
										int inputWelcomeNote = 0;
										while (inputWelcomeNote != 1){
										System.out.print("Type your Welcome note here\n1 => Exit");
										System.out.print("\nEnter: ");
										inputWelcomeNote = collector.nextInt();
										}
										break;
									case 4:
										int inputNetworkSelection = 0;
										while (inputNetworkSelection != 1){
										System.out.print("Network selection\nMTN\nGlo\nAirtel\n9Mobile\n1 => Exit");
										System.out.print("\nEnter: ");
										inputNetworkSelection = collector.nextInt();
										}
										break;
									case 5:
										int inputLight = 0;
										while (inputLight != 1){
										System.out.print("Light\n1 => Exit");
										System.out.print("\nEnter: ");
										inputLight = collector.nextInt();
										}
										break;
									case 6:
										int inputConfirmSIM = 0;
										while (inputConfirmSIM != 1){
										System.out.print("Confirm SIM services actions\n1 => Exit");
										System.out.print("\nEnter: ");
										inputConfirmSIM = collector.nextInt();
										}
										break;
								}
							}
							break;
						case 3:
							int inputSecuritySettings = 0;
							while (inputSecuritySettings != 7){
							System.out.print("Enter\nSECURITY SETTINGS MENU\n1 => PIN code request\n2 => Call barring service\n3 => Fixed dialling\n4 => Closed user group\n5 => Phone security\n6 => Change access codes\n7 => Exit to menu\n\n");
							System.out.print("\nEnter: ");
							inputSecuritySettings = collector.nextInt();
								switch(inputSecuritySettings){
									case 1:
										int inputPINCode = 0;
										while (inputPINCode != 1){
										System.out.print("PIN code request\n1 => Exit");
										System.out.print("\nEnter: ");
										inputPINCode = collector.nextInt();
										}
										break;
									case 2:
										int inputCallBarring = 0;
										while (inputCallBarring != 1){
										System.out.print("Call barring service\n1 => Exit");
										System.out.print("\nEnter: ");
										inputCallBarring = collector.nextInt();
										}
										break;
									case 3:
										int inputFixedDialling = 0;
										while (inputFixedDialling != 1){
										System.out.print("Fixed dialling\n1 => Exit");
										System.out.print("\nEnter: ");
										inputFixedDialling = collector.nextInt();
										}
										break;
									case 4:
										int inputClosedUser = 0;
										while (inputClosedUser != 1){
										System.out.print("Closed user group\n1 => Exit");
										System.out.print("\nEnter: ");
										inputClosedUser = collector.nextInt();
										}
										break;
									case 5:
										int inputPhoneSecurity = 0;
										while (inputPhoneSecurity != 1){
										System.out.print("Phone security\n1 => Exit");
										System.out.print("\nEnter: ");
										inputPhoneSecurity = collector.nextInt();
										}
										break;
									case 6:
										int inputChangeAccess = 0;
										while (inputChangeAccess != 1){
										System.out.print("Change access codes\n1 => Exit");
										System.out.print("\nEnter: ");
										inputChangeAccess = collector.nextInt();
										}
										break;
								}
							}
							break;
					}
				}
			break;
			case 7:
				int inputCallDivert = 0;
				while (inputCallDivert != 1){
				System.out.print("Call divert\n1 => Exit");
				System.out.print("\nEnter: ");
				inputCallDivert = collector.nextInt();
				}
				break;
			case 8:
				int inputGames = 0;
				while (inputGames != 1){
				System.out.print("Games\nSnakes\nSudoku\n1 => Exit");
				System.out.print("\nEnter: ");
				inputGames = collector.nextInt();
				}
				break;
			case 9:
				int inputCalculator = 0;
				while (inputCalculator != 1){
				System.out.print("Calculator\n1 => Exit");
				System.out.print("\nEnter: ");
				inputCalculator = collector.nextInt();
				}
				break;
			case 10:
				int inputReminders = 0;
				while (inputReminders != 1){
				System.out.print("Reminders\n1 => Exit");
				System.out.print("\nEnter: ");
				inputReminders = collector.nextInt();
				}
				break;
			case 11:
				int inputClock = 0;
				while (inputClock != 1){
				System.out.print("Enter\nCLOCK MENU\n1 => Alarm clock\n2 => Clock settings\n3 => Date settings\n4 => Stopwatch\n5 => Countdown timer\n6 => Auto update of date and time\n7 => Exit to menu\n\n");
				System.out.print("\nEnter: ");
				inputClock = collector.nextInt();
					switch(inputClock){
						case 1:
							int inputAlarmClock = 0;
							while (inputAlarmClock != 1){
							System.out.print("Alarm clock\n1 => Exit");
							System.out.print("\nEnter: ");
							inputAlarmClock = collector.nextInt();
							}
							break;
						case 2:
							int inputClockSettings = 0;
							while (inputClockSettings != 1){
							System.out.print("Clock settings\n1 => Exit");
							System.out.print("\nEnter: ");
							inputClockSettings = collector.nextInt();
							}
							break;
						case 3:
							int inputDateSettings = 0;
							while (inputDateSettings != 1){
							System.out.print("Date settings\n1 => Exit");
							System.out.print("\nEnter: ");
							inputDateSettings = collector.nextInt();
							}
							break;
						case 4:
							int inputStopwatch = 0;
							while (inputStopwatch != 1){
							System.out.print("Stopwatch\n1 => Exit");
							System.out.print("\nEnter: ");
							inputStopwatch = collector.nextInt();
							}
							break;
						case 5:
							int inputCountdownTimer = 0;
							while (inputCountdownTimer != 1){
							System.out.print("Countdown timer\n1 => Exit");
							System.out.print("\nEnter: ");
							inputCountdownTimer = collector.nextInt();
							}
							break;
						case 6:
							int inputAutoUpdate = 0;
							while (inputAutoUpdate != 1){
							System.out.print("Auto update of date and time\n1 => Exit");
							System.out.print("\nEnter: ");
							inputAutoUpdate = collector.nextInt();
							}
							break;
					}
				}
				break;
				case 12:
					int inputProfiles = 0;
					while (inputProfiles != 1){
					System.out.print("Reminders\n1 => Exit");
					System.out.print("\nEnter: ");
					inputProfiles = collector.nextInt();
					}
				break;
				case 13:
					int inputSIMServices = 0;
					while (inputSIMServices != 1){
					System.out.print("SIM services\n1 => Exit");
					System.out.print("\nEnter: ");
					inputSIMServices = collector.nextInt();
					}
				break;
			

		}
		
		}
	
	}


}