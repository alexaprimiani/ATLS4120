//
//  ViewController.swift
//  atls4120lab1
//
//  Created by alexa primiani on 9/9/20.
//  Copyright © 2020 alexa primiani. All rights reserved.
//

import UIKit

class ViewController: UIViewController {

    @IBOutlet weak var foodImage: UIImageView!
    @IBOutlet weak var foodType: UILabel!
    
    @IBAction func chooseFood(_ sender: UIButton) {
        if sender.tag == 1{
            foodImage.image = UIImage(named: "foodOption1")
            foodType.text = "kfc"
        }
        else if sender.tag == 2{
            foodImage.image = UIImage(named: "foodOption2")
            foodType.text = "steak and broccoli"
        }
    }
    
    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view.
    }


}

