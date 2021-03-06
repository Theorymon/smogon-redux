
(defpokemon :glameow
  :name "Glameow"
  :introduced-in :dp
  :types [[:normal]]
  :egggroups [[:ground]]
  :abilities [[:keen-eye :limber :own-tempo]]
  :stats [[49 55 42 42 37 85]]
  :weight [3.9]
  :height [0.5])

(defpokemon :purugly
  :name "Purugly"
  :introduced-in :dp
  :types [[:normal]]
  :egggroups [[:ground]]
  :abilities [[:defiant :own-tempo :thick-fat]]
  :stats [[71 82 64 64 59 112]]
  :weight [43.8]
  :height [1])

(deffamily :glameow :purugly)

(deflearnset :dp
  :glameow [:aerial-ace :assist :assurance :attract :bite :captivate :charm :cut :dig :double-team :dream-eater :endure :facade :faint-attack :fake-out :fake-tears :flail :flash :frustration :fury-cutter :fury-swipes :growl :headbutt :hidden-power :hypnosis :iron-tail :knock-off :last-resort :mud-slap :natural-gift :payback :protect :psych-up :quick-attack :rain-dance :rest :return :sand-attack :scratch :secret-power :shadow-ball :shadow-claw :shock-wave :slash :sleep-talk :snatch :snore :substitute :sucker-punch :sunny-day :super-fang :swagger :swift :tail-whip :taunt :thief :thunder :thunderbolt :torment :toxic :u-turn :water-pulse]
  :purugly [:body-slam :giga-impact :hyper-beam :roar :rollout])

(deflearnset :bw
  :glameow [:aerial-ace :assist :assurance :attract :bite :captivate :charm :covet :cut :dig :double-team :dream-eater :echoed-voice :facade :faint-attack :fake-out :fake-tears :flail :flash :foul-play :frustration :fury-swipes :growl :hidden-power :hone-claws :hyper-voice :hypnosis :iron-tail :knock-off :last-resort :payback :protect :psych-up :quick-attack :rain-dance :rest :retaliate :return :round :sand-attack :scratch :shadow-ball :shadow-claw :slash :sleep-talk :snatch :snore :substitute :sucker-punch :sunny-day :super-fang :swagger :tail-whip :taunt :thief :thunder :thunderbolt :torment :toxic :u-turn :wake-up-slap :work-up]
  :purugly [:body-slam :bulldoze :giga-impact :hyper-beam :roar])


(defpokemon :mew
  :name "Mew"
  :introduced-in :rb
  :types [[:psychic]]
  :egggroups [[]]
  :abilities [[:synchronize]
              :bw [:synchronize]]
  :stats [[100 100 100 100 100]
          :gs [100 100 100 100 100 100]]
  :weight [4]
  :height [0.4])

(deffamily :mew)

(deflearnset :rb
  :mew [:bide :blizzard :body-slam :bubblebeam :counter :cut :dig :double-edge :double-team :dragon-rage :dream-eater :earthquake :egg-bomb :explosion :fire-blast :fissure :flash :fly :horn-drill :hyper-beam :ice-beam :mega-drain :mega-kick :mega-punch :metronome :mimic :pay-day :pound :psychic :psywave :rage :razor-wind :reflect :rest :rock-slide :seismic-toss :selfdestruct :skull-bash :sky-attack :softboiled :solarbeam :strength :submission :substitute :surf :swift :swords-dance :take-down :teleport :thunder :thunder-wave :thunderbolt :toxic :transform :tri-attack :water-gun :whirlwind])

(deflearnset :gs
  :mew [:ancientpower :attract :blizzard :curse :cut :defense-curl :detect :dig :double-team :dragonbreath :dream-eater :dynamicpunch :earthquake :endure :fire-blast :fire-punch :flamethrower :flash :fly :frustration :fury-cutter :giga-drain :headbutt :hidden-power :hyper-beam :ice-beam :ice-punch :icy-wind :iron-tail :mega-punch :metronome :mud-slap :nightmare :pound :protect :psych-up :psychic :rain-dance :rest :return :roar :rock-smash :rollout :sandstorm :shadow-ball :sleep-talk :sludge-bomb :snore :solarbeam :steel-wing :strength :sunny-day :surf :swagger :sweet-scent :swift :thief :thunder :thunderbolt :thunderpunch :toxic :transform :waterfall :whirlpool :zap-cannon])

(deflearnset :rs
  :mew [:aerial-ace :ancientpower :attract :blizzard :body-slam :brick-break :bulk-up :bullet-seed :calm-mind :counter :cut :defense-curl :dig :dive :double-edge :double-team :dragon-claw :dream-eater :dynamicpunch :earthquake :endure :explosion :facade :faint-attack :fake-out :fire-blast :fire-punch :flamethrower :flash :fly :focus-punch :frustration :fury-cutter :giga-drain :hail :hidden-power :hyper-beam :hypnosis :ice-beam :ice-punch :icy-wind :iron-tail :light-screen :mega-kick :mega-punch :metronome :mimic :mud-slap :night-shade :nightmare :overheat :pound :protect :psych-up :psychic :rain-dance :reflect :rest :return :roar :rock-slide :rock-smash :rock-tomb :role-play :rollout :safeguard :sandstorm :secret-power :seismic-toss :selfdestruct :shadow-ball :shock-wave :skill-swap :sky-attack :sleep-talk :sludge-bomb :snatch :snore :softboiled :solarbeam :steel-wing :strength :substitute :sunny-day :surf :swagger :swift :swords-dance :taunt :thief :thunder :thunder-wave :thunderbolt :thunderpunch :torment :toxic :transform :water-pulse :waterfall :zap-cannon])

(deflearnset :dp
  :mew [:aerial-ace :air-cutter :amnesia :ancientpower :aqua-tail :attract :aura-sphere :avalanche :barrier :baton-pass :blizzard :block :bounce :brick-break :brine :bug-bite :bulk-up :bullet-seed :calm-mind :captivate :charge-beam :cut :dark-pulse :defog :dig :dive :double-team :dragon-claw :dragon-pulse :drain-punch :dream-eater :earth-power :earthquake :embargo :endeavor :endure :energy-ball :explosion :facade :false-swipe :fire-blast :fire-punch :flamethrower :flash :flash-cannon :fling :fly :focus-blast :focus-punch :frustration :fury-cutter :gastro-acid :giga-drain :giga-impact :grass-knot :gravity :gunk-shot :gyro-ball :hail :headbutt :heal-bell :heat-wave :helping-hand :hidden-power :hyper-beam :ice-beam :ice-punch :icy-wind :iron-defense :iron-head :iron-tail :knock-off :last-resort :light-screen :low-kick :magic-coat :magnet-rise :me-first :mega-punch :metronome :mud-slap :nasty-plot :natural-gift :ominous-wind :outrage :overheat :pain-split :payback :pluck :poison-jab :pound :protect :psych-up :psychic :rain-dance :recycle :reflect :rest :return :roar :rock-climb :rock-polish :rock-slide :rock-smash :rock-tomb :role-play :rollout :roost :safeguard :sandstorm :secret-power :seed-bomb :shadow-ball :shadow-claw :shock-wave :signal-beam :silver-wind :skill-swap :sky-attack :sleep-talk :sludge-bomb :snatch :snore :solarbeam :spite :stealth-rock :steel-wing :stone-edge :strength :string-shot :substitute :sucker-punch :sunny-day :super-fang :superpower :surf :swagger :swift :swords-dance :synthesis :tailwind :taunt :thief :thunder :thunder-wave :thunderbolt :thunderpunch :torment :toxic :transform :trick :trick-room :twister :u-turn :uproar :vacuum-wave :water-pulse :waterfall :whirlpool :will-o-wisp :worry-seed :x-scissor :zen-headbutt])

(deflearnset :bw
  :mew [:acrobatics :aerial-ace :after-you :ally-switch :amnesia :ancientpower :aqua-tail :attract :aura-sphere :barrier :baton-pass :bind :blizzard :block :bounce :brick-break :bug-bite :bulk-up :bulldoze :calm-mind :charge-beam :covet :cut :dark-pulse :dig :dive :double-team :dragon-claw :dragon-pulse :dragon-tail :drain-punch :dream-eater :drill-run :dual-chop :earth-power :earthquake :echoed-voice :electroweb :embargo :endeavor :energy-ball :explosion :facade :false-swipe :fire-blast :fire-punch :flame-charge :flamethrower :flash :flash-cannon :fling :fly :focus-blast :foul-play :frost-breath :frustration :gastro-acid :giga-drain :giga-impact :grass-knot :gravity :gunk-shot :gyro-ball :hail :heal-bell :heat-wave :helping-hand :hidden-power :hone-claws :hyper-beam :hyper-voice :ice-beam :ice-punch :icy-wind :incinerate :iron-defense :iron-head :iron-tail :knock-off :last-resort :light-screen :low-kick :low-sweep :magic-coat :magic-room :magnet-rise :me-first :mega-punch :metronome :nasty-plot :outrage :overheat :pain-split :payback :pluck :poison-jab :pound :protect :psych-up :psychic :psyshock :quash :rain-dance :recycle :reflect :reflect-type :rest :retaliate :return :roar :rock-polish :rock-slide :rock-smash :rock-tomb :role-play :roost :round :safeguard :sandstorm :scald :seed-bomb :shadow-ball :shadow-claw :signal-beam :skill-swap :sky-attack :sky-drop :sleep-talk :sludge-bomb :sludge-wave :smack-down :snarl :snatch :snore :solarbeam :spite :stealth-rock :stone-edge :strength :struggle-bug :substitute :sunny-day :super-fang :superpower :surf :swagger :swords-dance :synthesis :tailwind :taunt :telekinesis :thief :thunder :thunder-wave :thunderbolt :thunderpunch :torment :toxic :transform :trick :trick-room :u-turn :uproar :venoshock :volt-switch :waterfall :wild-charge :will-o-wisp :wonder-room :work-up :worry-seed :x-scissor :zen-headbutt])
