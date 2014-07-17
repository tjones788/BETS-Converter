package org.usd.edu.btl.cli;

import java.io.File;
import static org.usd.edu.btl.cli.Conversion.betsInput;
import static org.usd.edu.btl.cli.Conversion.bioExtractInput;
import static org.usd.edu.btl.cli.Conversion.bldInput;
import static org.usd.edu.btl.cli.Conversion.galaxyInput;
import static org.usd.edu.btl.cli.Conversion.iplantInput;
import static org.usd.edu.btl.cli.Conversion.seqInput;
import static org.usd.edu.btl.cli.InteractiveMode.userPrompts;

/**
 *
 * @author Tyler.Jones
 */
public class runCLI {

    static String inputFormat = null;
    static String outputFormat = null;
    static String inputFile = null;
    static String outputFile = null;

    String[] options = new String[10]; //array of options

    public static void main(String[] args) {
        System.out.println("Run Bets-CLI");
        //if there are no arguments, ask the user for them
        if (args.length < 1) {
            System.out.println("You have not entered any arguments.");
            System.out.println("Type -h or --help for help menu.");
            System.out.println("Exiting...");
            System.exit(1);
        }

        //Pre: Args have been entered, read them, get info
        //Post: Values for conversion have been set
        for (int i = 0; i < args.length; i++) { //for each argument
            try {
                String arg = args[i]; //get first argument, i-th index
                if (arg.equals("-I") || arg.equals("--inputformat")) { //if arg == -I or --inputformat                
                    inputFormat = args[++i]; //set the format of the specified input file
                    switch (inputFormat) {
                        case "iplant":
                            break;  //valid        
                        case "bets":
                            break; //valid
                        case "galaxy":
                            break; //valid
                        case "seq":
                            break; //valid
                        case "bld":
                            break; //valid
                        case "bioextract":
                            break; //valid
                        default: //catch all invalid input formats
                            throw new InvalidInputException("You Have Entered an Invalid Input Format\n"
                                    + "  Valid Options: iplant, bets, galaxy, seq, bld");
                    }
                } else if (arg.equals("-O") || arg.equals("--outputformat")) {
                    outputFormat = args[++i];
                    if (outputFormat == null) {
                        throw new InvalidInputException("You have not entered an Output Format.");
                    }
                    switch (outputFormat) {
                        case "iplant":
                            break;  //valid        
                        case "bets":
                            break; //valid
                        case "galaxy":
                            break; //valid
                        case "bioextract":
                            break;
                        case "seq":
                            break;
                        case "bld":
                            break;
                        default: //catch all invalid input formats
                            throw new InvalidInputException("You Have Entered an Invalid Output Format\n"
                                    + "  Valid Options: iplant, bets, galaxy");
                    }
                } else if (arg.equals("-i") || arg.equals("--infile")) {
                    inputFile = args[++i];
                    if (inputFile == null) {
                        throw new InvalidConversionException("No Input File Entered.");
                    }
                } else if (arg.equals("-o") || arg.equals("--outfile")) {
                    outputFile = args[++i];
                    //if null, send to screen
                } else if (arg.equals("-h") || arg.equals("--help")) {
                    System.out.println("=== BETS CONVERTER HELP ===\n");
                    StringBuilder sb = new StringBuilder();
                    sb.append("Input Format: -I --inputformat; [ -I iplant] [--inputformat bets]\n");
                    sb.append("  Desc: Format of Input File\n");
                    sb.append("  Options: iplant, bets, galaxy, seq, bld, bioextract\n\n");
                    sb.append("Ouput Format: -O --outputformat; [-O galaxy] [--outputformat bets]\n"); //or xml || or json?
                    sb.append("  Desc: Format to Convert to\n");
                    sb.append("  Options: iplant, bets, galaxy, bioextract, seq\n\n");
                    sb.append("Input File: -i --infile; [-i test_iplant.json]\n");
                    sb.append("  Desc: Specified Input File\n\n");
                    sb.append("Output File Name: -o --outfile; [-o test] [--outfile test]\n");
                    sb.append("  Desc: Name of the output file\n\n");
                    sb.append("Help Menu: -h --help\n");
                    sb.append("  Desc: Print Help Menu\n\n");
                    sb.append("Interactive Prompts: -p --prompt\n");
                    sb.append("  Desc: Starts interactive mode, where user is prompted for arguments.\n");
                    sb.append("--------------------------\n");
                    sb.append("Example: java -jar dist/BETS-CLI.jar  -I iplant -O bets -i test.json -o output1");
                    System.out.println(sb);
                    System.exit(0);
                } else if ((arg.equals("-p") || arg.equals("--prompt"))) {
                    userPrompts();
                } else {
                    System.out.println("You have entered an invalid argument.");
                    System.out.println("Type -h or --help for help menu.");
                    System.out.println("Exiting...");
                    System.exit(0);
                }
            } catch (InvalidInputException e) {
                System.out.println(e.getMessage());
            }
            //if all 8 required args have been entered
            System.out.println("\n ===Printing Arguments===");
            printArgs(); //print the entered arguments
            try {
                checkConversion();
            } catch (InvalidConversionException e) {
                System.out.println(e.getMessage());
                System.exit(0);
            }
        }
    }
    
    
    /* *************
     Helper Methods
     *************
     */

    /**
     * Print the arguments.
     */
    public static void printArgs() {
        System.out.println(
                "Input Format = " + inputFormat);
        System.out.println(
                "Output Format= " + outputFormat);
        System.out.println(
                "Input File = " + inputFile);
        System.out.println(
                "Output Name = " + outputFile);
        System.out.println("----------------");
        System.out.println(
                "Converting " + inputFormat + " --> " + outputFormat);
        System.out.println(
                "Output File: " + outputFile + "\n");
    }

    /**
     *
     * @throws InvalidConversionException
     */
    public static void checkConversion() throws InvalidConversionException {
        System.out.println("Checking Conversion...");
        //Check if Conversion can be done.
        //Invalid Conversions: seq --> iplant, bld --> iplant
        if (inputFormat.equalsIgnoreCase("seq") && outputFormat.equalsIgnoreCase("iplant")) {
            throw new InvalidConversionException("Sorry, conversion cannot be done.");
        } else {
            System.out.println("Success - Performing Conversion...");
            performConversion(inputFormat, outputFormat, outputFile);
        }
    }

    /**
     *
     * @param inputFormat
     * @param outputFormat
     * @param outputFile
     */
    public static void performConversion(String inputFormat, String outputFormat, String outputFile) {
        File input = new File("./test_inputs/" + inputFile); //iPlantInput

        switch (inputFormat) {
            case "iplant":
                iplantInput(input, outputFormat, outputFile);
                break;  //valid        
            case "bets":
                betsInput(input, outputFormat, outputFile);
                break; //valid
            case "galaxy":
                galaxyInput(input, outputFormat, outputFile);
                break; //valid
            case "seq":
                seqInput(input, outputFormat, outputFile);
                break; //valid
            case "bld":
                bldInput(input, outputFormat, outputFile);
                break; //valid
            case "bioextract":
                bioExtractInput(input, outputFormat, outputFile);
                break;
            default: //catch all invalid input formats
                System.out.println("Should not reach this.");
        }
    }
}
//print to screen only when there is no ouput file name specified
