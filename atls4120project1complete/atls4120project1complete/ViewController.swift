//
//  ViewController.swift
//  atls4120project1complete
//
//  Created by alexa primiani on 10/6/20.
//  Copyright © 2020 alexa primiani. All rights reserved.
//

import UIKit

class ViewController: UIViewController, UITextFieldDelegate {

    @IBOutlet weak var weightAmount: UITextField!
    @IBOutlet weak var sexSelector: UISegmentedControl!
    @IBOutlet weak var beerLabel: UILabel!
    @IBOutlet weak var beerStepper: UIStepper!
    @IBOutlet weak var shotLabel: UILabel!
    @IBOutlet weak var shotStepper: UIStepper!
    @IBOutlet weak var wineLabel: UILabel!
    @IBOutlet weak var wineStepper: UIStepper!
    @IBOutlet weak var bacLabel: UILabel!
    @IBOutlet weak var drivingLabel: UILabel!
    @IBOutlet weak var hoursSlider: UISlider!
    @IBOutlet weak var minutesSlider: UISlider!
    @IBOutlet weak var hoursLabel: UILabel!
    @IBOutlet weak var minutesLabel: UILabel!
    
    
    func textFieldShouldReturn(_ textField: UITextField) -> Bool {
        textField.resignFirstResponder()
        return true
    }
    
    @IBAction func updateBeers(_ sender: UIStepper) {
        if beerStepper.value == 1{
                beerLabel.text = "1 beer"
            }
            else{
                beerLabel.text = String(format: "%.0f", beerStepper.value) + " beers"
            }
         updateBAC()
        }
    
    @IBAction func updateWine(_ sender: UIStepper) {
        if wineStepper.value == 1{
                wineLabel.text = "1 wine glass"
            }
            else{
                wineLabel.text = String(format: "%.0f", wineStepper.value) + " wine glasses"
            }
         updateBAC()
        }
    
    @IBAction func updateShots(_ sender: UIStepper) {
        if shotStepper.value == 1{
                shotLabel.text = "1 shot"
            }
            else{
                shotLabel.text = String(format: "%.0f", shotStepper.value) + " shots"
            }
         updateBAC()
        }
    
    var hours:Float = 0.0
    var minutes:Float = 0.0
    
    @IBAction func updateHours(_ sender: UISlider) {
        hoursLabel.text = String(format: "%.0f", sender.value) + " h"
        hours = Float(sender.value)
    }
    
    @IBAction func updateMinutes(_ sender: UISlider) {
        minutesLabel.text = String(format: "%.0f", sender.value) + " m"
        minutes = Float(sender.value)
    }
    
    func updateBAC(){
        var r:Float = 0.0
        
         if sexSelector.selectedSegmentIndex == 0{
             r = 0.68
         }
         if sexSelector.selectedSegmentIndex == 1{
             r = 0.55
         }
        
        var weight:Float
        
        if weightAmount.text!.isEmpty {
           weight = 0.0
        }
        else {
            weight = Float(weightAmount.text!)!
        }
        
        let amountOfBeers = beerStepper.value
        let amountOfWine = wineStepper.value
        let amountOfShots = shotStepper.value
        var alcGrams:Float
        var weightGrams:Float
        var calculatedBAC:Float = 0.0
        var time:Float
        
        alcGrams = Float(amountOfBeers + amountOfWine + amountOfShots) * 14
        weightGrams = weight * 453.59237
        time = hours + (minutes/60)
        calculatedBAC = ((alcGrams / (weightGrams * r)) * 100) - time
        
        bacLabel.text = "\(calculatedBAC)"
    }
    
    override func viewDidLoad() {
        super.viewDidLoad()
        weightAmount.delegate=self
            // Do any additional setup after loading the view.
            
            // the code below is from chapter 7 of the textbook
            NotificationCenter.default.addObserver(self, selector: #selector(keyboardWillShow), name: UIResponder.keyboardWillShowNotification, object: nil)
                   NotificationCenter.default.addObserver(self, selector: #selector(keyboardWillHide), name: UIResponder.keyboardWillHideNotification, object: nil)
                   let tap: UITapGestureRecognizer = UITapGestureRecognizer(target: self, action: #selector(self.dismissKeyboard))
                   view.addGestureRecognizer(tap)
               }
               @objc func dismissKeyboard() {
                   view.endEditing(true)
               }
               @objc func keyboardWillShow(notification: NSNotification) {
                   if let keyboardSize = (notification.userInfo?[UIResponder.keyboardFrameEndUserInfoKey] as? NSValue)?.cgRectValue {
                       if self.view.frame.origin.y == 0 {
                           //self.view.frame.origin.y -= keyboardSize.height
                       }
                   }
               }
               @objc func keyboardWillHide(notification: NSNotification) {
                   if ((notification.userInfo?[UIResponder.keyboardFrameEndUserInfoKey] as? NSValue)?.cgRectValue) != nil {
                       if self.view.frame.origin.y != 0 {
                           self.view.frame.origin.y = 0
                       }
                   }
            
            
        }
        // Do any additional setup after loading the view.


}


